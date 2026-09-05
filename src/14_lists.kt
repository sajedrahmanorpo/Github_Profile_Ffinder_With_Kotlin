fun main(){
    //val array = arrayOf(1, 2, 3)
    //val list = mutableListOf(1, 2, 3)
    //list.add(4)
    //list.remove(element = 1)
    //list.removeAt(index = 0)
    //println(list)


//    val list = mutableListOf<Int>()
//    for (i in 1..5) {
//        val x = readLine()?.toInt()
//        if (x != null) {
//            list.add(x)
//        }
//    }
//    println(list)


    println("Please enter 5 numbers:")
    val list = mutableListOf<Int>()
    for (i in 1..5){
        val x = readLine()?.toInt()
        if (x != null){
            list.add(x)
        }
    }
    println("The 5 numbers in reverse order are:")
    for (i in list.reversed()){
        println(i)
    }
}