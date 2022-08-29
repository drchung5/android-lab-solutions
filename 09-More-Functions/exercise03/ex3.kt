// Create a recursive function to calculate the sum of numbers 
// between 1 and n.  Is your function a candidate for tail recursion? 
// 
// This function is not candidate for tail recursion

fun sum(n :Int) :Int {
  if(n == 1)
    return 1
  else
    return n + sum(n-1)
}

fun main() {
  println(sum(5))
}