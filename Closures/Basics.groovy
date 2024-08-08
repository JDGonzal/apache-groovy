/* groovylint-disable MethodParameterTypeRequired */
final BL = '\n' // brake line or `println " "`
def c = { }
println c.class.name // Basics$_run_closure1
println c instanceof Closure  // true

def sayHello = { name ->
  println "Hello, $name"
}

sayHello('Juan') // Helo, Juan // Hello

List nums = [1, 2, 3, 4, 5, 6, 7, 78, 9]
// In an `each` the `it` took the elements of `List`
nums.each({ print "$it |" })  // 1 |2 |3 |4 |5 |6 |7 |78 |9 |
print BL

// Another way is using an specific argument,
// in this case is `num`
nums.each({ num ->
  print "$num |"  // 1 |2 |3 |4 |5 |6 |7 |78 |9 |
})
print BL

// Closures are objects & last param
def timesTen(num, closure){
  closure(num * 10)
}
timesTen(20, { println it }) // 200
timesTen(5) { println it }  // 50

// The number directly apply a `clousure` as:
10.times { print "$it |" } // 0 |1 |2 |3 |4 |5 |6 |7 |8 |9 |
print BL

// import `Random`
import java.util.Random
Random rand = new Random()
3.times {
  print "${rand.nextInt()}, " // -1935321065, 1004274475, 2119764057,
}
print BL
