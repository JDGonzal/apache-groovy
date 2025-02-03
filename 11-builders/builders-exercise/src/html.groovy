import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('html/books.html')
MarkupBuilder builder = new MarkupBuilder(writer)

Books b = new  Books()

builder.html(lang:'es') {
    head {
        title 'Lista de Libros'
        meta (name : 'description', content:'Algunos Libros')
        meta (name:'keywords', content: 'Books, Groovy, Java, Developer')
    }
    body {
        h1 'lista de libros'
        p 'Algunos libros sugeridos'
        section {
            h2 'Libros'
            table{
                tr {
                    th 'ISBN'
                    th 'Titulo'
                    th 'Autor'
                    th 'Precio'
                }
                b.books.each { aBook ->
                    tr{
                        td aBook.isbn
                        td aBook.title
                        td aBook.author
                        td aBook.price
                    }
                }
            }
        }
    }
}
