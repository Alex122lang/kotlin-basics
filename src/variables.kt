// variables are containers for storing data
// to create variables in kotlin we use the following
// var :: the value stored can be changed
// or val :: the value cannot be changed
var name = "Alex"
val occupation = "software developer" //
val myNum = 5 // integer (whole numbers)
val doubleNum = 5.00 // double (decimal notations)
val myLetter = "J" // char
val isKotlinFun = true // boolean = true or false
val cars = arrayOf("Volvo", "BMW", "Ford", true) // array
// array elements are accessed using the index position

// to output in kotlin create function main
fun main(){
    name = "Kinyanjui"
    println(name)
    println(occupation)
    println(myNum)
    println(doubleNum)
    println(myLetter)
    println(cars[1])
}
