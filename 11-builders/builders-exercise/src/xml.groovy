import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()

Books b = new  Books()

builder.books(){
    b.books.each { aBook ->
        book( isbn: aBook.isbn ) {
            title  aBook.title
            author  aBook.author
            price  aBook.price
        }
    }
}
