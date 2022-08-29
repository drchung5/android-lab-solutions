// Create a nullable String. Use the safe call and Elvis operators 
// to print the String length. If the String is null print "null String"

fun main() {
    var a :String? = null //"Hello, World!"
    var len :Int? = a?.length
    println( len ?: "null String"  )
}
