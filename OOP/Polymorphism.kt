open class Animal(){
    open fun makeSound(){                      //open keyword na dile ei function ta extend kora jabena
        println("There is no sound")
    }
    open fun makeColour(){
        println("There is no colour")
    }
}
class Dog : Animal(){

    override fun makeSound(){           //resue the same function
        println("Woof Woof")
    }
}
class Cat : Animal(){
    override fun makeSound(){
        println("Meow Meow")
    }
     override fun makeColour(){
        println("White Colour Cat")
    }
}

fun main(){

   // val variable_name : variable_type (parent class) = Class_name
    val animal1 : Animal = Dog()
    animal1.makeSound()

    val animal2 :Animal = Cat()
    animal2.makeSound()
    animal2.makeColour()


}