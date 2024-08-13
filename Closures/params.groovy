// implicit parameter
def foo = {
  println it
}
foo('juan')  // juan

// Al least one parameter
def foo2 = { name ->
  println name
}
foo2('piza')  // piza

// No parameters
def noparams = {
  println 'no params...'
}
noparams() // no params...

// Many parameters
def sayHello = { String first, String last ->
  println "Hello, $first $last"
}
sayHello('Juan', 'Piza') // Hello, Juan Piza

// default values
def greet = { String name, String greeting = 'Howdy' ->
  println "$greeting, $name"
}
greet('Juan', 'Hello') // Hello, Juan
greet('Ivan')  // Howdy, Ivan

// var-arg
def concat = { String... args ->
  args.join('')
}
println concat('abc', 'xyz')  // abcxyz
println concat('def', 'ghi', '123')  // defghi123

// Closure type
def someMethod(Closure c) {
  println '...'
  println c.maximumNumberOfParameters // 2
  println c.parameterTypes  // [int, int]
}

def someClosure = { int x, int y -> x + y }
someMethod(someClosure)
