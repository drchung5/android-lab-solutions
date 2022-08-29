// Write a program to print the letters (lowercase) of the 
// alphabet not contained in "kotlin"

fun main() {
    
  for( c in 'a'..'z' ) {
      if( !"kotlin".contains(c)) println(c)
  }

}