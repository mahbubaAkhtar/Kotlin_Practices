fun main(){
    greet()
    greet("Jamil")
    greet("Jamil" , "Khan")
}
fun greet(){
    println("Hello Student!")
}
fun greet(Name : String){
    println("Hello $Name!")
}
fun greet(FirstName : String, LastName : String){
    println("Hello $FirstName $LastName!")
}