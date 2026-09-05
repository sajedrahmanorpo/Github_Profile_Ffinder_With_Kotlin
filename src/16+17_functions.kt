/* FUNCTION WITH ARGUEMENT*/

//fun main(){
//    printPow(2,3)
//    printPow(1,8)
//    printPow(3,5)
//    printPow(8,2)
//}
//
//fun printPow(base: Int,  exponent: Int){
//    var result = 1;
//    for (i in 1..exponent){
//        result *= base
//    }
//    println("$base to the power of $exponent is $result")
//}
//
//fun printThreeLines(){
//    println("First line")
//    println("Second line")
//    println("Third line")
//}

//fun main(){
//    sumOfAllNumbers(1,5)
//}
//
//fun sumOfAllNumbers(firstValue: Int, lastValue: Int){
//    var sum = 0;
//    for(i in firstValue..lastValue){
//        sum += i
//    }
//    println("The sum of values from $firstValue to $lastValue is $sum")
//}



/*FUNCTION WITH RETURN VALUES*/
//fun printPow(base: Int, exponent: Int): Int{
//    var result = 1
//    for (i in 1..exponent){
//        result *= base
//    }
//    return result
//}
//fun main(){
//    val pow = printPow(2, 3)
//    println("The value is: $pow")
//}

//fun sumOfAllNumbers(firstNum: Int, lastNum: Int): Int{
//    var sum = 0;
//    for (i in firstNum..lastNum){
//        sum += i
//    }
//    return sum
//}
//
//fun main(){
//    val returnSum = sumOfAllNumbers(1,5)
//    println("The sum is: $returnSum")
//}

fun myList(list: List<Int>, input:Int): Int{
    for (i in 0..<list.size-1){
        if(list[i] == input){
            return i
        }
    }
    return -1
}

fun main(){
    val list = listOf(3, 2, 8, 10, 1, 16, 20)
    println("The list looks like: $list")
    println("Search for this number:")
    val userInput = readlnOrNull()?.toInt()
    if(userInput != null){
        println("The index of $userInput is ${myList(list, userInput)}")
    }
}