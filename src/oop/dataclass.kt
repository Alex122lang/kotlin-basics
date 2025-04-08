package oop

// these classes are normally used to hold data objects
data class User(val name: String, val Id: Int)

// enum classes : hold a collection of constant values
enum class Directions{
    NORTH, SOUTH, EAST, WEST
}
fun main(){
    val user1 = User("Alex", 328)
    println(user1)
}