// Java Sample Paters
import java.util.regex.*

Pattern pattern = Pattern.compile('a\\\\b')
println pattern
println pattern.class

// What pattterns will look like in Groovy
String slashy = /a\b/
println slashy
println slashy.class

String url = $/http://estesitio.com/pagina/$
println url

// Find | Match
def text = 'Si me gusta el rugby que mejor que ser fan de los AllBlacks'
def pattern2 = ~/fan de los/
def finder = text =~ pattern2 // Si hallamos parte en el texto
def matcher = text ==~ pattern2 //Si coincide exactamente
println finder
println finder.size()
println matcher

def text2 = 'fan de los'
def pattern3 = ~/fan de los/
def matcher2 = text2 ==~ pattern3
println matcher2

text = text.replaceFirst(pattern2, 'dueño de')
println text
