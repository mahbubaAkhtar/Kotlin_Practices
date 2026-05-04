fun main(){

//    Arithmetic Operators
    var number1 = 10;
    println("Number1 is: $number1")

    var number4 = 30;
    var number5 = 30;
    var result = number4 + number5;
    println("Result is: $result")

    var number2 = 20;
    var number3 = 30;
    println("Number2 - number3 is: ${number2 - number3}")
    println("Number2 * number3 is: ${number2 * number3}")
    println("Number2 / number3 is: ${number2 / number3}")
    println("Number2 % number3 is: ${number2 % number3}")


//    Logical Operators
    val x = 10
    val y = 20
    println(x<10 && y<10)
    println(x<=10 && y>10)
    println(x<=10 || y<10)
    println(x!=10)
    println(x!=15)

    val isKotlinFun = true
    val isFishTasty = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false
}