// Create Point class
// Points have two Int fields (x,y)
// 
// Create a singleton PointFactory class with a function to create Point objects
// The PointFactory should keep track of the number of Points created
// 
// Implement a main() method that uses the PointFactory, creates a few Points  
// then prints the number of Points created

data class Point(var x :Int, var y :Int)

object PointFactory{
    var count = 0
    fun createPoint(x :Int, y :Int) :Point {
		count++
        return Point(x,y)
    }
}

fun main() {
	  PointFactory.createPoint(1,2)
	  PointFactory.createPoint(2,2)
  
    println(PointFactory.count)
}
