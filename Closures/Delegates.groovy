// Delegates.groovy
def writer = {
  append 'Juan'
  append ' lives in Medellín'
}

/*
def append(String s) {
  println "append() called with agument of $s"
}
// append() called with agument of Juan
// append() called with agument of  lives in Medellín
*/

StringBuffer sb = new StringBuffer()
// Adding at end the `DELEGATE_FIRST`
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb

println writer() // Juan lives in Medellín
