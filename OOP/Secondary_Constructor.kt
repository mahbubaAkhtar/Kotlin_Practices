//create a MircoBus class
class MicroBus{
        // create two property
        var model: String  //global veriable
        var colour: String

        constructor(model : String){
            this.model = model
            this.colour = "No Colour"
            println("This is model constructor")
        }
    constructor(model: String, colour: String){
        this.model = model
        this.colour = colour
        println("This is model and colour constructor")
    }
    fun horn(){
        println("$colour $model horn beep beep")
    }
}
fun main(){
    val microBus1 = MicroBus("Hyndai",)
    val microBus2 = MicroBus("Maruti Swift","Red")
    microBus1.horn()
    microBus2.horn()
}