// when is a conditional in kotlin that allows comparison
// switches based on a correct match to the condition
var day = 7
fun main(){
    // basic when statment
    when(day){
        1 -> println("monday")
        2 -> println("tuesday")
        3 -> println("wednesday")
        4 -> println("thursday")
        5 -> println("friday")
        6,7 -> println("weekend")
        else -> println("invalid day")

    }
    fun main(){
        // when expression
        val daytype = when(day){
            in 1..5 -> "weekday"
            6,7 -> "weekend"
            else -> "invalid"
        }
        println(daytype)
    }
    // when like an if..else
    val x = 20
    when{
        x < 0 -> println("negative")
        x > 0 -> println("positive")
        x == 0 -> println("zero")
        else -> println("NaN")

    }
}
