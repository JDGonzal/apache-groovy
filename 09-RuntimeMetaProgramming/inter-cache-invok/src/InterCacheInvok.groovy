// Intercept / Cache / Invoke Pattern
class Developer {

    List languages = []

    def methodMissing(String name, args) {
        println "${name}() method was called..."

        if(name.startsWith('write')){
            String language = name.split('write')[1]

            if(languages.contains(language)){
                def imp = { Object[] theArgs ->
                    println "I like to write code in $language"
                }
                getMetaClass()."$name" = imp
                return imp(args)
            }
        }
    }
}

Developer dev = new Developer()
dev.languages << 'Groovy'
dev.languages << 'Java'
    println dev.metaClass.methods.size()
dev.writeGroovy()
dev.writeGroovy()
dev.writeGroovy()
    println dev.metaClass.methods.size()
dev.writeJava()
    println dev.metaClass.methods.size()
