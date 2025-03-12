import groovy.sql.GroovyRowResult
import groovy.sql.Sql

String username = 'root'
String password = 'qwer1234'

def sql = Sql.newInstance('jdbc:mysql://localhost:3306/sakila', username, password, 'com.mysql.jdbc.Driver')
println 'Connected!'

// Delete `users` table before to start
sql.execute('DROP TABLE IF EXISTS users;')

// create schema
sql.execute('''
CREATE TABLE users(
    id INT NOT NULL,
    username VARCHAR(45) NOT NULL,
    name VARCHAR(45) NULL,
    PRIMARY KEY (id)
);
''')

// create some data
sql.execute('''
    INSERT INTO users (id, username, name) 
    VALUES
    (1, 'jpiza', 'Juan Piza'),
    (2, 'samuel', 'Samuel González'),
    (3, 'timmy', 'Timoty González'),
    (4, 'sofia', 'Sofía González'),
    (5, 'milagros', 'Milagros Pérez');
''')

// crate a new file to hold our users in and put in the header values
def file = new File('sakila.csv')

// adding the header
file.write("id,username,name\n")

// query, reading each row and writing in file
sql.eachRow('SELECT * FROM users'){ row->
    file.append("${row.id},${row.username},${row.name}\n")
}

// calling close manually
sql.close()
