import groovy.xml.XmlSlurper

/* import groovy.xml.XmlSlurper

def xml = '''
    <sports>
        <sport id="1">
            <name>Football</name>
        </sport>
    </sports>
'''

def sports = new XmlSlurper().parseText(xml)

println sports.getClass().getName()
println sports.sport.name  */

def sports = new XmlSlurper().parse('data/sports.xml')
println sports
println sports.sport[2].name
