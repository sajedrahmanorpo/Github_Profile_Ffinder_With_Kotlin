fun main(){
//    val myArray = arrayOf(1,2,3,4,5)
//    val arrayLength = myArray.size
//    var i = 0
//    while (i < myArray.size) {
//        print(myArray[i])
//        i++
//    }


//    println("Please enter a number:")
//    val num = readLine()?.toIntOrNull()
//
//    if(num != null){
//        var i = num
//        while (i >= 0){
//            println(i)
//            i--
//        }
//    }


    println("Enter number 1:")
    val num1 = readLine()?.toIntOrNull()

    println("Enter number 2:")
    val num2 = readLine()?.toIntOrNull()

    var result = 1
    var i = 0

    while(num1 != null && num2 != null && i < num2){
        result = result * num1
        i++
    }
    println("$num1 to the power of $num2 is: $result")
}