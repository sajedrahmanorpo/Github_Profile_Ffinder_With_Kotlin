fun main(){
//    val x = 2
//    val y = 3
//    println(x < y)

//    println(3>4 || 4>3 && 4<=4)

    val bool = true
    val x = 9
    val y = 3
    val z = 9
    val hardExpression = !(x!=z) && bool || z > (x+y) && (!bool || y < z)
    println("The answer is: $hardExpression")
}