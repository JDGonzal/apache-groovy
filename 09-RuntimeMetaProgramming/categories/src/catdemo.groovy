// String.metaClass.shout = { -> toUpperCase() }
// println 'Hello, World'.shout() // HELLO, WORLD

use(StringCategory) {
    println 'Hello, World'.shout()
}

println 'Hello, World'.shout()
