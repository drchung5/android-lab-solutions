// Create a hierarchy of Employee types. Include at least: 
// Managers who get a fixed salary
// Wait Staff who get paid hourly plus tips
// Hosts who get paid hourly
// Salespeople who get a base + % of sales

// Create at least a couple of each and put them in an array. 
// Print out how much each person is making this week.Print 
// out the total amount paid in salary (manager salary + sales 
// base), hourly (wait staff hourly + host hourly), tips, commissions

abstract class Employee( val name :String) {
  abstract fun salary() :Int
}

class Manager( name: String, val weekly :Int ) : Employee(name) {
  override fun salary() = weekly
}

class Waitstaff(
        name: String,
        val rate :Int,
        val hours :Int,
        val tips: Int) : Employee(name) {
  override fun salary() = (rate * hours) + tips
}

class Host(
        name: String,
        val rate :Int,
        val hours :Int) : Employee(name) {
  override fun salary() = rate * hours
}

class Sales(
        name: String,
        val base :Int,
        val sales :Int,
        val percent: Int) : Employee(name) {
  override fun salary() = base + (sales * percent/100)
}

fun main() {
  val employees = arrayOf(
          Manager("Dave",2500),
          Manager("Amy", 2850),
          Waitstaff("Michael", 5, 24, 500))

  for( e in employees ) println("${e.name}: ${e.salary()}")
}
