// !Modify a function to have two arguments
/* 
 Important: A variable declared using the val keyword can only be set once. You cannot change its value later in the program.
 You can declare a changeable variable with the var keyword
 */
fun main() {
    val border = "`-._,-'"
    var timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("  Happy Birthday, Jhansi!")
    printBorder(border, timesToRepeat)
}

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}
