import kotlin.math.ln

fun main(){
    //Pseudocode
        // Demonstrate the use of five different operators. For this example, I'll use +, -, /, >= and ++
        // using variables assigned with integers, I test said operators and print the results for each test

    var a = 62
    var b = 94
    var ans1 = a + b
    println(ans1)

    var ans2 = ans1 + b
    println(ans2)

    var ans3 = ans2 / 2
    println(ans3)

    var compare1 = ans1 >= ans3
    print(compare1)

    ans2++
    println("\n" + ans2++)
}