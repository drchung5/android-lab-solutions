// Create a list of Collections of Ints as shown
//	var a = listOf(
//            listOf(100,200,300),
//            setOf(10,20,30,40,50),
//            listOf(1000,2000)
//          )
//
//  Select the appropriate functions (map(), reduce(), 
//  filter(), flatten()) to 
//  
//      a) create a list of the sums of each 
//         nested list [600,150,3000] 
//	    b) find the sum of all the elements of 
//	       all the collections

fun main() {

  var a = listOf(
            listOf(100,200,300),
            setOf(10,20,30,40,50),
            listOf(1000,2000)
          )

  // sum of each collection: [600, 150, 3000]
  println(a.map{it.reduce{sum,n->sum+n}})  
  
  // sum of all collections: 3750
  println(                                 
      a.map{it.reduce{sum,n->sum+n}}
          .reduce{sum,n->sum+n})
  
  // also sum of all collections: 3750
  println(a.flatten().reduce{sum,n->sum+n})

}
