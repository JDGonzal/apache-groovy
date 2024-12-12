// Exceptions
// ----------------------

// Así se implmenta en `java`
// public void foo() throw Exception{
//   throw new Exception() // Lanzamos una excepción
// }

// Así es en `groovy`
def foo() {
  throw new Exception('Foo Exception')
}

List log = []

try {
  foo()
} catch( Exception e) {
  log << e.message
} finally {
  log << 'finally'
}
// Imprimimos el contenido de la variable `log`
println log // [Foo Exception, finally]

// Sintaxis en `java7`
try {
  // Hace algo
} catch(FileNotfoundException | nullPoinerException e){
  println e.class.name
  println e.message
}
