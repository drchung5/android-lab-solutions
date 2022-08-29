// Write a program that takes this string, 
//
//   "She sells seashells by the seashore" 
//  
// and prints the number of distinct (non-space) characters. 
//
// Hints: 
//   - you can write this program in one line by chaining together methods. 
//   - use code completion or the Kotlin docs to look at the various array 
//       conversion (toXXX) methods available
//   - consider how to get rid of the spaces for counting purposes

fun main() {
  println("She sells sea shells by the seashore".toSet().filter{it !=' '}.count())
}