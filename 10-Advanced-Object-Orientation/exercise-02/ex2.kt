// Create a Price interface that defines a cost field and a total() function. 
// Create an Item class with a description field that implements the Price 
// interface through a delegate. Create two implementations (delegates) of 
// Price. On that returns the cost from total() and one that returns the cost 
// plus 7% tax from the total.
// 
// Create some taxable and non-taxable items and print their prices and descriptions.

interface Price {
  val cost :Int
  fun total() :Int
}

class PriceTaxImpl( override val cost: Int ) : Price {
  override fun total(): Int {
      return cost + (0.07 * cost.toDouble()).toInt()
  }
}

class PriceNoTaxImpl( override val cost: Int ) : Price {
  override fun total(): Int {
      return cost
  }
}

class Item(
        private val p :Price,
        val desc: String 
  ) : Price by p

fun main() {
  val items = listOf( 
    Item(PriceNoTaxImpl(10), "Aspirin"),
    Item(PriceTaxImpl(5), "Soda"),
    Item(PriceNoTaxImpl(3), "Bananas")
  )
  
  for( a in items)  println("${a.desc} $${a.total()}")
}