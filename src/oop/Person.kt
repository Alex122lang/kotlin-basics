package oop

class Person {
    // properties
    var name: String = ""
    var age: Int = 0
    // methods
    fun speak(){
        println("Hello , my name is $name, I'm $age")
    }
}
// kotlin provides a more concise way of declaring
// classes : classes declared using a constructor
class Vehicle(val model: String , val make:String, val yom: Int){
    fun identifyCar(){
        println("This car is $make $model and was manufactured $yom")
    }
}
// create an object from above class
fun main() {
    val person1 = Person()
    val person2 = Person()
    person1.name = "Alex"
    person1.age = 23
    person1.speak()

    val Vehicle1 = Vehicle("Corolla", "Toyota", 2006)
    val Vehicle2 = Vehicle("X", "Toyota", 2003)
    Vehicle1.identifyCar()
    Vehicle2.identifyCar()

}