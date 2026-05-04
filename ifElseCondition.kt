fun main(){
    val age =18
    if(age<=17){
        println("YOU CAN GIVE VOTE")
    }
    else{
        println("YOU CAN'T GIVE VOTE")
    }

    //range
    if(age in 18 .. 40){
        println("YOU CAN GIVE VOTE")
    }
    else{
        println("YOU CAN'T GIVE VOTE")
    }

}