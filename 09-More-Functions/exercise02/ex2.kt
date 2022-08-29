// Create a Rectangle class that constructs a rectangle from two points. 
// Create a new infix function so that this expression is true if the 
// rectangles are similar:   rect1 similar rect2
//
// Hint: rectangles are similar if their aspect ratios are the same

data class Rectangle(val x1 :Int, 
                     val y1 :Int,
                     val x2 :Int,
                     val y2 :Int) {
    
	infix fun similar( that :Rectangle) :Boolean {
        return (x1-x2)/(y1-y2) == (that.x1-that.x2)/(that.y1-that.y2)
    }
    
}

fun main() {
    var a = Rectangle(2,2,4,4)
    var b = Rectangle(4,4,8,8)

    println(a similar b)
}