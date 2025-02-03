import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('html/about.html')
MarkupBuilder builder = new MarkupBuilder(writer)

List courses =[
        [id:1, name:'Apache Groovy'],
        [id:2, name:'JavaScript']
]

builder.html(lang:'es') {
    head {
        title 'Juan Piza'
        meta (name : 'description', content:'Página acerca de mi')
        meta (name:'keywords', content: 'Juan Piza, Groovy, Java, Spring')
    }
    body {
        h1 'Una breve biografía'
        p 'Una reseña resumida de mi labor'
        section {
            h2 'Cursos'
            table{
                tr {
                    th 'id'
                    th 'nombre'
                }
                courses.each { course ->
                    tr{
                        td course.id
                        td course.name
                    }
                }
            }
        }
    }
}
