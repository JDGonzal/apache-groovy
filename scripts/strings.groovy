/* groovylint-disable CompileStatic, TrailingWhitespace */
// Working with Strings in Groovy
// Java ::
char c = 'c'
println c.class

String str = 'this is a string'
println str.class

// Groovy ::
def c2 = 'c'
println c2.class

def str2 = 'this is a string'
println str2.class

// string interpolation
// Java ::
String name = "Juan"
String msg = "Hello " + name + "..."
println msg

// Groovy ::
String msg2 = "Hello ${name}..."
println msg2

String msg3 = 'Hello ${name}...'
println msg3

String msg4 = "We can evaluate expressions here: ${1 + 1}"
println msg4

// multiline strings
def aLargeMsg = """
a
Message
goes
here
"""
println aLargeMsg

// dollar slashy
def folder = $/c:\apache-groovy\scripts\strings.groovy/$
println folder
