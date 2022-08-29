// Use a when statement to print the odd numbers and multiples 
// of 4 between 1 and 100

fun main() {
    
  for( i in 1..100 ) {
      when(true) {
         i%2 == 1 -> println(i)  
         i%4 == 0 -> println(i)
      }
  }
  
}