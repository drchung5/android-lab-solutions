// Create a singleton FishFactory that creates Fish objects. Fish objects 
// should have name(species) and length(inches). Make Fish an inner or nested 
// class of FishFactory.  
// 
// Create an ArrayList of fish objects. Iterate across the ArrayList and print 
// the name(species) of each Fish. 
// 
// Explain why you chose to use a nested or inner class

object FishFactory{

  data class Fish( val type :String, val length :Int )

  fun getFish( type :String, length :Int ) :Fish = Fish( type, length )

}

fun main() {
  val fishList = ArrayList<FishFactory.Fish>()
  
  fishList.add(FishFactory.getFish("trout", 18))
  fishList.add(FishFactory.getFish("catfish", 36))
  fishList.add(FishFactory.getFish("snook", 40))
  fishList.add(FishFactory.getFish("redfish", 30))

  for( fish in fishList ) println( fish.type )
}
