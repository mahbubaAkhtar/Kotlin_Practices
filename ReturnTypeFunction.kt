fun main(){

    val percentage = calculatePercentage(285 , 300)
    println("Your total percentage: $percentage%")
}
fun calculatePercentage(marks : Int , totalMarks : Int): Float{
    return (marks.toFloat() / totalMarks) * 100
}