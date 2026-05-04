fun main(){
    calculateMarks(maths = 90 , science = 99 , 96) //Argument

}
fun calculateMarks(maths : Int , science : Int , english : Int ){ //Parameter
    val total = maths + science + english
    println("Your total marks is $total")
}


//fun main(){
//    println("Welcome To Our Food Ordering System")
//    orderFood(items = "Burger", quantity = 3 )
//    orderFood(items = "Pizza", quantity = 2 )
//    orderFood(items = "Sandwich", quantity = 10 )
//}
//fun orderFood(items : String , quantity: Int) {
//    println("Your Ordering food is $items " + "And $items quantity is $quantity")
//}
