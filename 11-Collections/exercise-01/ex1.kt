// Create a map using months (pick 3 or 4) as keys (e.g. "JAN", "FEB","MAR").  
// And IntArrays as values. Populate the IntArrays with random integers 
// representing individual sales in a given month as shown below
// 
//     var salesByMonth = mapOf(
//              "JAN" to intArrayOf(100,110,10,600,2000,20,110,10),
//              "FEB" to intArrayOf(50,4,200),
//              "MAR" to intArrayOf(1000,1123,1234)
//            )
//            
// Use map and reduce functions to reduce the intArrays to a monthly sales total 
// and create a new map. Print the new map. The output for the map above looks like:
// 
//         {JAN=2960, FEB=254, MAR=3357}

fun main() {

  var salesByMonth = mapOf(
          "JAN" to intArrayOf(100,110,10,600,2000,20,110,10),
          "FEB" to intArrayOf(50,4,200),
          "MAR" to intArrayOf(1000,1123,1234)
  )

  var salesTotalsByMonth =
          salesByMonth.mapValues{
              it.value.reduce{ sum, n -> sum + n }
          }

  println(salesTotalsByMonth)

}