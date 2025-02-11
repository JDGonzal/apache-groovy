import groovy.json.JsonSlurper

/*import groovy.json.JsonSlurper

def books = '''
{
    "books": {
        "book001": {
            "title": "Alicia en el Pais de las Maravillas",
            "isbn": "978-84-37610-92-4",
            "author": {
                "first": "Lewis",
                "last": "Carroll",
                "x": "@_Lewis_Carroll_"
            },
            "related": [
                "Novela de fantas\\u00eda",
                "Escritor brit\\u00e1nico Charles Lutwidge Dodgson",
                "Bajo el seud\\u00f3nimo de Lewis Carroll",
                "Publicada en 1865"
            ]
        }
    }
}
'''

JsonSlurper slurper = new JsonSlurper()
def json = slurper.parseText(books)

// println json
// println json.getClass().getName()
println json.books.book001.title*/

JsonSlurper slurper = new JsonSlurper()
def json = slurper.parse(new File('data/books.json'))

println json.books.book001
println json.books.book002.title
println json.books.book002.author
println json.books.book002.related
