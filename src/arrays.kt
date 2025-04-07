// used to store multiple  values in a single variable
// create an array using arrayOf() . listOf()
val car_s = arrayOf("Volvo", "BMW", "Mazda",0, "Jeep", arrayOf("Toyota Axio", "Toyota Corolla"))
// accessing elements inside of an array
// we access an element by referring to the index number inside
fun main(){
    println(car_s[0]) // accessing elements
    // changing an element in an array
    // simply access element and reassign its value
    car_s[3] = "Toyota Corolla"
    println(car_s)
    // to know the number of element in an array use the .size method
    println(car_s.size) // 5
    // checking if an element exists in an array
    // use the 'in' operator
    if("Jeep" in car_s){
        println("It exists")
    }else{
        println("It does not exist")
    }
    // looping/transversing an array ,forEach , for loop
    for(x in car_s){
        println(x)
    }

}