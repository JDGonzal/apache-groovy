import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()
builder.books(){
    book001 {
        title 'Alicia en el Pais de las Maravillas'
        isbn '978-84-37610-92-4'
        author (first:'Lewis', last: 'Carroll', x :'@_Lewis_Carroll_' )
        related 'Novela de fantasía', 'Escritor británico Charles Lutwidge Dodgson', 'Bajo el seudónimo de Lewis Carroll', 'Publicada en 1865'
    }
    book002 {
        title 'YO, JULIA'
        isbn '978-84-08197-40-9'
        author (first:'Santiago', last: 'Posterguillo', x :'@SPosteguillo' )
        related 'Premio Planeta 2018 “Yo, Julia”.', 'Escritor Español', 'Autor de \'Los asesinos del emperador\' y de la trilogía de Publio Cornelio Escipión', 'Publicada en 2018'
    }
}

new File('data/books.json').write(builder.toPrettyString())
