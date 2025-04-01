// A loop allow repeat tasks a number of set times or over a collection of data
// In kotlin for loop , while loop and foreach loop
// while loop(continues as long as condition is true)
// and for each loop(used to loop over collection e.g. arrays)
fun main(){
    // for loop
    // iterate over a range
    for(i in 1..5){
        println(i)
    }
    // adding a step
    for(i in 1..10 step 2){
        println(i)
    }
    // iterate down
    for(i in 5 downTo 1){
        println(i)
    }
    // iterate over a collection
    val fruits = listOf("Apple" , "Banana" , "Cherry")
    for(i in fruits){
        converttoUpper(i)
        println(i)
    }
    // print with index position
    for((index,fruit) in fruits.withIndex()){
       println("$index :: $fruit")
    }
    // while loop
    var i = 1
    // basic while loop
    while (i <= 5){
        println(i)
        i++
    }
    // do while loop :: do executes without conditions
    // then utilizes the while block to look at the condition
    var j = 1
    do{
        println(j)
        j++
    }while (j <= 5)


}
fun converttoUpper(i: String){
    println(i.uppercase())
}