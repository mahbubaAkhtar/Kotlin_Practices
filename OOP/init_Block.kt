class Toy(val name : String){
    init {
        println("I'm create a $name")
    }
}
fun main( ){
    val toy1 = Toy("doll")
    val toy2 = Toy("Car")
}