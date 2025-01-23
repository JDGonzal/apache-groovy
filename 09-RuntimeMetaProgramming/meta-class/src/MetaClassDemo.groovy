// MetaClass Demo

// Expando e = new Expando()
// e.name = 'Juan'
// e.writeCode = { -> println "$name ama aprender código"}
// e.writeCode()

class Developer{

}
// per instance
Developer me = new Developer()
// println 'Cualquier texto sin impotancia'
me.metaClass.name = 'Juan'
me.metaClass.writeCode = { -> println "$name ama aprender código"}
me.writeCode()

String.metaClass.shout = { -> toUpperCase() }
println 'hola juan'.shout() // HOLA JUAN
