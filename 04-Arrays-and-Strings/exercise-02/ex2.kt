// Write program that uses a single raw String to print the following
//
//    He said, "I think it's pretty expensive!"
//    She replied, "No, it's just $10."

fun main() {
  println(
    """The custpmer said, "I think it's pretty expensive!"
      |The clerk replied, "No, it's just $10."""".trimMargin()
   )
}