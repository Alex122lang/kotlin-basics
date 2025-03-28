// strings used to store text
// collection of characters surrounded by double quotes
var txt = "Hello World"
// string concatination
var firstname = "Alex"
var lastname = "Kinyanjui"
fun main(){
    // accessing a character in a string
    println(txt[4])
    // getting the length of the string
    println(txt.length)
    println(txt.uppercase())
    println(txt.lowercase())
    // +
    var fullname = "My Name is " + firstname + "" + lastname
    println(fullname)
    println("My Name is $firstname $lastname")

}
