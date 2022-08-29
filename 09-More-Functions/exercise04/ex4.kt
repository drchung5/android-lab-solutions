// Create an array of Points, use the filter() 
// function select all Points on the x or y axis
// Use let() to print the results

import java.util.Arrays

data class Point(val x :Int, val y :Int) {
      override fun toString() :String { return "(${x},${y})" }
}

fun main() {
    val a = arrayOf(
        		Point(1,2),
        		Point(0,1),
        		Point(1,0),
        		Point(0,0),
        		Point(3,2),
    		)
    
    val b = a.filter{it.x == 0 || it.y == 0}
    
    b.let{println(it)}
}