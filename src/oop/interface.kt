package oop

// are  contracts between classes
// use the keyword interface to create one
// an interface will define functions which must be implemented on any class that extends the interface
interface Measurements{
    fun area() : Double
    fun perimeter() : Double
}
class Circle(val radius: Double) : Measurements{
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }

}
// GET AREA AND PERIMETER OF A SQUARE USING THE INTERFACE

class Square(val length: Double) : Measurements{
    override fun area(): Double{
        return length * length
    }
    override fun perimeter(): Double{
        return 4 * length
    }
}
fun main(){
    val circle1 = Circle(10.0)
    println(circle1.area())
    println(circle1.perimeter())
    val square1 = Square(45.0)
    println(square1.area())
    println(square1.perimeter())
}
