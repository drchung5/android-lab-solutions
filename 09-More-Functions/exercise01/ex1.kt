// Create a Point class that stores the (X,Y) coordinates of a Point. 
// Overload the + (plus) == operator and the toString() function 
// 
//     Hint: base your comparisons on distance from (0,0)

data class Point(val x :Int, val y :Int) {
    
  operator fun plus(that :Point) :Point {
    return Point( this.x + that.x, this.y + that.y )
  }
  override fun toString() :String { return "(${x},${y})" }
  
}

fun main() {
  var a = Point(2,2)
  var b = Point(1,3)
  var c = a + b
  println(c.toString())
}