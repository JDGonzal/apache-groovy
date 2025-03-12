import groovy.sql.GroovyRowResult
import groovy.sql.Sql

String username = 'root'
String password = 'qwer1234'

def sql = Sql.newInstance('jdbc:mysql://localhost:3306/sakila', username, password, 'com.mysql.jdbc.Driver')
println 'Connected!'

// Delete `users` table before to start
sql.execute('DROP TABLE IF EXISTS users;')

def tableList = sql.rows('SHOW TABLES;')
def count =0
tableList.each {
    count +=1
}
println "Total of tables are ${count}"

// create schema
sql.execute('''
CREATE TABLE users(
    id INT NOT NULL,
    username VARCHAR(45) NOT NULL,
    bio VARCHAR(45) NULL,
    PRIMARY KEY (id)
);
''')

tableList = sql.rows('SHOW TABLES;')
count =0
tableList.each {
    count +=1
}
println "Total of tables are ${count}"

// create some data
sql.execute('''
    INSERT INTO users (id, username, bio) 
    VALUES(1,'JPiza', 'QA Student');
''')

def sakilaUser = [id:2, username: 'foo', bio: 'foo']
sql.execute("""
    INSERT INTO users (id, username, bio) 
    VALUES(${sakilaUser.id}, ${sakilaUser.username}, ${sakilaUser.bio});
""")

// Checkig the `users` table
List<GroovyRowResult> rows = sql.rows('SELECT * FROM users;')
println rows

sql.eachRow('SELECT * FROM users;'){ row ->
    println "Sakila: ${row.username}"
}

// calling close manually
sql.close()
