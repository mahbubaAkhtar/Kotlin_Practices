fun main(){
    val mealTime = "M"

    when(mealTime){
        "Morning" -> {
            println("I eat one boiled egg")
            println("I also salad")
        }
        "MidMorning" -> println("I eat green tea")
        "Lunch" -> println("I eat rice")
        "Dinner" -> println("I eat salad")

        else -> println("I don't have anything")
    }
}