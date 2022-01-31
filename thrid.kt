// ! Use argument to change the border
fun main() {
    val border="%"
    println("Hello, world!\n")
    printBorder(border)
    birthdayMessage()
    printBorder(border)
}
fun birthdayMessage() {
    var name="Jhanshi"
    println("Happy Birthday, $name!")   
}
/*
  A String is a piece of text made up of characters surrounded by quotes.
  You can think of it as beads lined up on a string to form a necklace, 
  like, characters lined up to form words and text. Specifying that the 
  argument has to be a String helps the system enforce that your argument 
  is text, and not, for example, a number.
*/
fun printBorder(border: String) {
    repeat(23) {
        print(border)
    }    
    println()
}