abstract class Vehicle{
    abstract  fun engine()    //abstract function without body

    fun horn(){
        println("Peep peep")
    }
}

class Truck : Vehicle(){
    override fun engine() {
        println("Car engine model is xml ")
    }
}

class Bike : Vehicle(){
    override fun engine() {
        println("Bike engine model is xml ")
    }
}

fun main(){
   // val vehicle = Vehicle()      // Abstract class er object create kora jaina
    //create object
    val truck = Truck()
    truck.engine()
    truck.horn()

    val bike = Bike()
    bike.engine()
}