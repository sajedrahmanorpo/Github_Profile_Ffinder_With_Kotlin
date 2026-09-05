fun main() {
    // val myaArray = arrayOf(1,2,3,4,5)
    //    for(i in myaArray){
    //        println(i)
    //    }

//    for (i in 1..10 step 2) {
//        println(i)
//    }
//    for (i in 'A'..'Z'){
//        print(i)
//        print("\n")
//    }

//    val myArray = arrayOf(2, 1, 3, 8 , 9, -1, 10, 11)
//    var max = myArray[0]
//
//    for(i in myArray){
//        if(i > max){
//            max = i
//        }
//    }
//    println(max)

//    val myArray = arrayOf(1,2,3,4,5)
//    var sum = 0
//
//    for(i in myArray){
//        sum+=i
//    }
//    println(sum)

    println("Please enter 5 numbers:")
    var sum = 0

    for(i in 1..5){
        val input = readLine()?.toIntOrNull()
        if (input != null){
            sum += input
        } else{
            println("Invalid number")
        }
    }
    val avrg = sum.toDouble() / 5
    println("Average of 5 numbers = $avrg")
}