// Execute the code sample from the Short Circuiting Operations slide. 
// Make sure you can explain short circuit behavior.

fun main() {
t() && f()  // prints true false    
f() && t()	// prints false     
t() || f()	// prints true	    
f() || t()	// prints false true
}

fun t(): Boolean { println("true");  return true }
fun f(): Boolean { println("false"); return false }