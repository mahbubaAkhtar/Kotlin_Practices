
//class => blueprint
class Student{
    var name = " "
    var age = 0
    var roll = 0
    fun doHomework(){
        println("$name's homework is done")
    }
    fun interoduction(){
        println("My name is $name and I am $age years old")
    }
}

fun main(){
    //val variable_name = class_name (constructor)
    val student1 = Student()  //    create object
    println(student1)       //Check obj1 memory address
    student1.name = "Mahbuba Akhtar"   //excess the propertice
    student1.age = 25
    student1.roll = 1
    student1.doHomework()
    student1.interoduction()

    val student2 = Student()
    student2.name = "Rakib Hasan"
    student2.age = 30
    student2.roll = 2
    student2.doHomework()
    student2.interoduction()
}