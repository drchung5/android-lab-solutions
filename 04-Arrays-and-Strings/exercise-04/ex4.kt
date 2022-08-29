// Write a program that creates an array of values from 1 to 10. 
// Use a filter to extract and print the values that are factors of 42. 
// (hint: 2,3,6,7 – exclude 1)

const val THE_ANSWER_TO_LIFE_THE_UNIVERSE_AND_EVERYTHING = 42

fun main() {

  val a = IntArray(10){it + 1}

  val factors = a.filter{ 
                  THE_ANSWER_TO_LIFE_THE_UNIVERSE_AND_EVERYTHING %it == 0 && it != 1
                }
                
  println(factors)

}
