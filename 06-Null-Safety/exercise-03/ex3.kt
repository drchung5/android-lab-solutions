// Implement the three ways to call a method on a nullable reference. 
// Demonstrate them with both a null and non-null reference. Do not duplicate any code.

fun main() {
    for( a in arrayOf(intArrayOf(1,2,3,4,5), null)) 
        printAverage(a)
}

fun printAverage( a :IntArray? ) {
    // explicit null check
    if( a != null ) {
        println("if: ${a.average()}") 
    }
    println("safe call:          ${a?.average()}")
    println("not null assertion: ${a!!.average()}")
}