//Primary Constructor
class Car(var brand: String, var color: String, var model: String, var year: Int) {
    fun carIntroduction(){
        println("My car brand is $brand\nThis colour is $color,model is $model and year is $year")
    }
}
fun main(){
    //Primary Constructor
    val car1 = Car("Toyota","Red" ,"XS",2024)
//    println(car1.brand)
//    println(car1.color)
//    println(car1.model)
//    println(car1.year)
    car1.carIntroduction()


}
