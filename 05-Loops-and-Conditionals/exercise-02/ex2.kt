// Write a program to print all the prime numbers from 1 to 100
//
// this solution is a variation of the Sieve of Eratsthenes

fun main() {
  val n = 101
  val primes = Array(n, {true})
  for( i in 2..n/2) {
  	for( j in 2*i..100 step i ) {
        primes[j] = false
    }
  }
  
  for( i in 1..100 ) {
      if(primes[i]) print( " "+i )
  }
 
}