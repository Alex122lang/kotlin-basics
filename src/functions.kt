// functions are reusable blocks of code that perform a specific task
// simple function / named function
fun greet(){
    println("Hello from the named function")
}
// function with parameters
fun greet_with_params(name: String){
    name.uppercase()
    println("hello from the params function : $name")
}
// function with a 'return' value
fun add(a: Int, b: Int): Int{
    return a + b
}
//functions with default arguments
fun subtract(a: Int = 10, b: Int = 10): Int{
    return a - b
}
fun main(){
    greet() //invoking a function
    greet_with_params("Alex")
    greet_with_params("John")
    val sum = add(5, 3)
    println(sum)
    val diff = subtract(10,5)
    println(diff)
}