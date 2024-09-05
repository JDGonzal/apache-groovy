// Closure Basics
// --------------------
// Done - Locate the class groovy.lang.Closure and spend a few minutes looking through documentation.
// - Create a Method that accepts a closure as an argument
def myMethod(Closure c) {
  c()
}
// - Create a closure that performs some action
def foo = { println 'Any text' } // Any text
// - Call the method and pass the closure to it.
myMethod(foo) // Any text
// - Create a list and use them each to iterate over each item in the list and print it out
//     Hint - You can use the implicit it or use your own variable
List names = ['Ana', 'Berto', 'Carlos', 'Diana', 'Esteban', 'Francia']
names.each { print "${it }, " } // Ana, Berto, Carlos, Diana, Esteban, Francia,
println ''
// - Create a map of data and iterate over it using each method.
//     This method can take a closure that accepts 1 or 2 arguments.
//     Use 2 arguments and print out the key and value on each line.
Map vehicles = [car: 'Chevrolet', moto: 'Pulsar', rocket: 'Space-X']
vehicles.each { key, value ->
  print "$key=$value - "
} // car=Chevrolet - moto=Pulsar - rocket=Space-X -
println ''
// - Demonstrate the use of curry and try to come up with an example different from the one we used in the lecture.
def greet = { String greeting, String name ->
  println "$greeting, $name"
}
greet('Hello', 'Juan') // Hello, Juan
def sayHello = greet.curry('Hello')
sayHello('Piza') // Hello, Piza

// Explore the GDK
// --------------------
List people = [
  [name: 'Zulia', city: 'Bello'],
  [name: 'Yelitza', city: 'Chia'],
  [name: 'Xander', city: 'Dabeiba'],
  [name: 'Wilson', city: 'Espinal'],
  [name: 'Vanesa', city: 'Facativa'],
  [name: 'Ulises', city: 'Gómez Plata'],
  [name: 'Tamara', city: 'Bello'],
  [name: 'Sonia', city: 'Dabeiba'],
  [name: 'Raul', city: 'Facativa']
]
// - Search for the find and findAll methods.
//     What is the difference between the two?
//     Write some code to show how they both work.
println people.find { person -> person.city == 'Dabeiba' } // [name:Xander, city:Dabeiba]
println people.findAll { person -> person.city == 'Bello' } //[[name:Zulia, city:Bello], [name:Tamara, city:Bello]]
// - Search for the any and every methods.
//     What is the difference between the two?
//     Write some code to show how they both work.
println people.any { person -> person.city == 'Facativa' } // true
println people.any { person -> person.city == 'Zipaquirá' } // false
println people.every { person -> person.city == 'Bello' } // false
println people.every { person -> person.name.size() >= 4 } // true
// - Search for the method groupBy that accepts a closure
//     What does this method do?
//     Write an example of how to use this method.
def peopleByCity = people.groupBy { person -> person.city }
println peopleByCity
/*
[Bello:[[name:Zulia, city:Bello], [name:Tamara, city:Bello]],
Chia:[[name:Yelitza, city:Chia]],
Dabeiba:[[name:Xander, city:Dabeiba], [name:Sonia, city:Dabeiba]],
Espinal:[[name:Wilson, city:Espinal]],
Facativa:[[name:Vanesa, city:Facativa], [name:Raul, city:Facativa]],
Gómez Plata:[[name:Ulises, city:Gómez Plata]]]
*/
def bellanitas = peopleByCity['Bello']
def facas = peopleByCity.Facativa

println bellanitas // [[name:Zulia, city:Bello], [name:Tamara, city:Bello]]
println facas // [[name:Vanesa, city:Facativa], [name:Raul, city:Facativa]]
facas.each { print "$it.name, " } // Vanesa, Raul,
println ''
