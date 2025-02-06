import groovy.transform.ToString

@ToString(includeNames = true)
class Book{
    String title
    String summary
    List<Section> sections =[]
}

@ToString(includeNames = true)
class Section {
    String title
    List<Chapter> chapters = []
}

@ToString(includeNames = true)
class Chapter{
    String title
}

// Java style
/*
public Book createBook(){
    Book b = new Book();
    b.setTitle('My Book');
    b.setSummary('My Summary');

    Section s = new Section();
    s.setTitle('Section 1');

    Chapter c1 = new Chapter();
    c1.setTitle('Chapter 1');
    Chapter c2 = new Chapter();
    c2.setTitle('Chapter 2');

    s.addChapter(c1, c2);
    b.getSections().add(s);

    return book;
}
*/

// Groovy style
ObjectGraphBuilder builder = new ObjectGraphBuilder()
def book = builder.book(
        title: 'Groovy en Action 2nd Edition',
        summary: 'Groovy in Action, Second Edition an more text') {
    section(title: 'Section 1') {
        chapter(title: 'Chapter 1')
        chapter(title: 'Chapter 2')
        chapter(title: 'Chapter 3')
            }
    section(title: 'Section 2') {
        chapter(title: 'Chapter 4')
        chapter(title: 'Chapter 5')
        chapter(title: 'Chapter 6')
    }
}
println book

assert book.title == 'Groovy en Action 2nd Edition' // Referencia a la clase `Book`
assert book.sections.size() == 2 // Referencia a la clase `Section`
assert book.sections[0].title == 'Section 1' // Referencia a la clase `Section`
assert book.sections[0].chapters.size() == 3 // Referencia a la clase `Chapter`
