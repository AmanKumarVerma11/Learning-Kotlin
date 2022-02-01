// !Create a cake with the layers and candles.
/*
*In this task, you are going to upgrade the birthday cake code to always be the right size with the right number of candles for any age.
 => You will create a total of three functions for drawing a layered cake with candles.
 => You will use a repeat() inside another repeat(), creating what's called a "nested loop".
 => The way you will build up this code is how you can build up any program, starting with the big picture and adding detail. This is called "top-down development".
 => The instructions are not as detailed for this practice, and you can refer to the finished code if you get stuck.
*/

fun main() {
    val age=24
    val layers=5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}
fun printCakeCandles(age: Int) {
    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print(".")
    }
    println()  // Print an empty line 
    print(" ")
    repeat(age) {
        print("|")
    }
    println()
}
fun printCakeTop(age: Int) {
    print(" ")
    repeat(age) {
        print("=")
    }
    println()
}
fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
       repeat(age+2) {
           print("@")
       }
       println()
    }
}