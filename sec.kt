//In this we used function inside a function, we can return a function or rather use it normally.
fun main() {
    println("Hello, world!\n")
    birthdayMessage()
}
fun birthdayMessage() {
    var name="Jhanshi"
    printBorder()
    println("Happy Birthday, ${name}!") 
    printBorder()
    /*
     To use a variable inside a print statement, 
     you need to surround it with some symbols that
     tell the system that what comes next is not text,
     but a variable.Instead of printing text, the system
     needs to print the value of the variable. You do 
     this by putting your variable inside curly braces 
     preceded by a dollar sign, like in the example below.
     ?  ${variable}
    */
}
fun printBorder() {
    println("=======================")
}
/*
 => The repeat() statement starts with the word repeat, followed by ().
    This kind of statement is referred to as a ‘loop' because you are 
    repeating or looping over the same code multiple times. 
    You will learn about other ways of creating loops later.
 => Inside the parentheses () is the number of repetitions,
 => followed by curly braces {},and inside the curly braces {}, is the code to repeat.
*/
fun printFancyBorder() {
    repeat(23) {   
        print("+")
    }
    println("")
}