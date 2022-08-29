// Write a program that uses a loop to test whether a string is a palindrome.
//   	Hint: a palindrome is a word/phrase that is the same (ignoring 
//          case/spaces) forwards and backwards (e.g. "kayak", "taco cat")

fun main() {
    
  val p = "A man a plan a canal Panama".toLowerCase().replace(" ","")

  var isPalindrome = true
  
  for( i in 0..p.length/2 ) {
      if( p[i] != p[p.length-(1+i)] ) {
          isPalindrome = false
          break
      }
  }
  
  println( "Palindrome: ${isPalindrome}" )
  
}
