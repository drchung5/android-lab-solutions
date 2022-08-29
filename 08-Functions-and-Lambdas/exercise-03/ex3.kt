// Create your own IntArray.myFilter() extension function. It should 
// behave exactly like IntArray.filter() hint: use var list = arrayListOf<Int>()

import java.util.Arrays

fun IntArray.myFilter(f :(Int)->Boolean) : List<Int> {
    var list = arrayListOf<Int>()
    for( a in this ) {
        if(f(a)) list.add(a)
    }
    return list
}

fun main() {
    val a = (1..100).toList().toIntArray()
    val b = a.myFilter{it%11==0}
    for( x in b ) println(x)
}