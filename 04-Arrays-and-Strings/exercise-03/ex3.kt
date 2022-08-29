// Write a program that creates an array of Ints and uses String Templates 
// to print the array and the average (converted to an Int). 
//
// The average of [1,2,3,4,5] is 3.

fun main() {

  // this array initialization uses a lambda
  // it could also be written: 
  //
  // val a = intArrayOf(1,2,3,4,5)

  val a = IntArray(5){it + 1} 

  println( "The average of ${a.contentToString()} is ${a.average().toInt()}." )
   
}
