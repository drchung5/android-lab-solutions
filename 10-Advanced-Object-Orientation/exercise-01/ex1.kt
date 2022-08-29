// Modify the Employee hierarchy from an earlier lab so that each specialized 
// Employee type keeps track of how many instances of that type are created.  
// Also have the superclass (Employee) track the total number of Employees 
// created of all types. 
// 
// Hint: use companion objects

abstract class Employee( val name :String) {

  init{ Instance.count++ }

  companion object Instance { var count = 0 }

  abstract fun salary() :Int
}

class Manager( name: String, val weekly :Int ) : Employee(name) {

  init{ Instance.count++ }
  companion object Instance { var count = 0 }

  override fun salary() = weekly
}

class Waitstaff(
      name: String,
      val rate :Int,
      val hours :Int,
      val tips: Int) : Employee(name) {

  init{ Instance.count++ }
  companion object Instance { var count = 0 }

  override fun salary() = (rate * hours) + tips
}

class Host(
      name: String,
      val rate :Int,
      val hours :Int) : Employee(name) {

  init{ Instance.count++ }
  companion object Instance { var count = 0 }

  override fun salary() = rate * hours
}

class Sales(
      name: String,
      val base :Int,
      val sales :Int,
      val percent: Int) : Employee(name) {

  init{ Instance.count++ }
  companion object Instance { var count = 0 }

  override fun salary() = base + (sales * percent/100)
}

fun main() {
  val employees = arrayOf(
          Manager("Dave",2500),
          Manager("Amy", 2850),
          Waitstaff("Michael", 5, 24, 500))

  println("${Employee.Instance.count} employees")
  println("${Manager.Instance.count} managers")
  println("${Waitstaff.Instance.count} waitstaff")
  println("${Host.Instance.count} hosts")
  println("${Sales.Instance.count} sales")

  for( e in employees ) println("${e.name}: ${e.salary()}")
}