// Write a program to print the sum of all the even numbers 
// between 1 and 100 (inclusive)

fun main() {
    
  var sum = 0
  for( i in 2..100 step 2) {
     sum += i
  }
  println(sum)

}