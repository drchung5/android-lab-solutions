// Create a higher order function that returns a lambda with this signature:
//               () -> Unit
// Store the lambda in a variable. Call the lambda multiple times. Each time it  
// is called, the lambda should print a higher number (1,2,3..). Use a closure 
// instead of a companion object.

fun foo() : () -> Unit {
  var a = 0 // the closure
  return  {
      println(++a)
  }
}

fun main() {
  val f = foo()
  f() // 1
  f() // 2
  f() // 3
}