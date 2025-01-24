// **Expando**

// * Cree una clase Expando
Expando e = new Expando()

// * Agregue algunas propiedades y métodos
// Properties
e.first = 'Juan'
e.last = 'Piza'
e.email = 'jpiza@mail.com'
// Methods
e.getFullName = {
    "$first $last"
}

println e.toString()
println e.getFullName()

// * Sabiendo que la metaclase de una clase es un expando, cree su propia clase y agréguele propiedades y métodos.
@groovy.transform.ToString(includeNames = true)
class Person {
    String first, last
}

Person p = new Person(first: 'Juan', last: 'Piza')
p.metaClass.email = 'jpiza@mail.com'
println p
println p.email
