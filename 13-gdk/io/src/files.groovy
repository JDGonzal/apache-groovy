// Create a new file
def file = new File('dummy.txt')

file.write('Este es un texto cualquiera\n')

// Add more Text
file.append('y quiero continuar con otra línea\n')

// Read those lines
List lines = file.readLines()
lines.each {
    // println it
}

String currentDir = '../'

new File(currentDir).eachFileRecurse {
    // Show all first
    if (it.isFile()){
        // println it.name
    }
}

new File('.').eachFile {
    if (it.name.endsWith('.groovy')){
        println it.name
    }
}
