// Create a Pont class similar to the one from the previous module. 
// Add an extension function to find the distance of the point from 
// the origin (0,0)(The formula is square_root(x^2 + y^2))

import kotlin.math.*

data class Point(var x :Int, var y :Int)

fun Point.distance() = sqrt((x*x + y*y).toDouble())

fun main() {
	val p1 = Point(3,4)

    println(p1.distance())
    
}