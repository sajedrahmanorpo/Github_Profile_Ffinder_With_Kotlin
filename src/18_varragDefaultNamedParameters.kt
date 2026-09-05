//fun main(){
//    //val array = intArrayOf(20, 40, 60)
//    //    val max = getMax(1, 3, 4, /* *array,*/ 9, 10, 3, 47, 5, 0)
//    //    println("The maximum number is: $max")
//
//    searchFor(search = "How to become a good programmer")
//}
//
//fun searchFor(search: String, searchEngine: String = "GOOGLE"){
//    println("Searching for $search on $searchEngine")
//}
//
//fun getMax(vararg numbers: Int): Int{
//    var max = numbers[0]
//    for (number in numbers){
//        if(number > max){
//            max = number
//        }
//    }
//    return max
//}

//fun main(){
//    val sum1 = alternatingSum(1, 2, 3, 4, 5)
//    println("The sum is: $sum1")
//
//    val sum2 = alternatingSum(10, 20, 30)
//    println("The sum is: $sum2")
//}
//
//fun alternatingSum(vararg numbers: Int): Int{
//    var sum = 0
//    for(i in numbers.indices){
//        if(i % 2 == 0){
//            sum += numbers[i]
//        }else{
//            sum -= numbers[i]
//        }
//    }
//    return sum
//}

fun main(){
    val list = listOf<Int>(1, 2, 3, 4, 5)
    println("The sum is: ${alternatingSum(list)}")

    val list2 = listOf<Int>(10, 20, 30)
    println("The sum2 is: ${alternatingSum(list2)}")
}

fun alternatingSum(list: List<Int>): Int{
    var sum = 0
    for (i in list.indices){
        if(i % 2 == 0){
            sum += list[i]
        }else{
            sum -= list[i]
        }
    }
    return sum
}