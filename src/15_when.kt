//fun main(){
//    val day = readLine()?.toIntOrNull()
//    val result = when (day){
//        1 -> "Monday"
//        2 -> "Tuesday"
//        3 -> "Wednesday"
//        4 -> "Thursday"
//        5 -> "Friday"
//        6 -> "Saturday"
//        7 -> "Sunday"
//        else -> "Invalid day."
//    }
//    println(result)
//}

//fun main(){
//    val age = readLine()?.toIntOrNull()
//     when (age){
//         in 0..5 -> println("You're a young kid!")
//         in 6..17 -> println("You're a teenager!")
//         18 -> println("Finally you're 18!")
//         19, 20 -> println("You're a young adult!")
//         in 21..65 -> println("You're an adult!")
//         else -> println("You're really old!")
//     }
//}

fun main(){
    val country = readLine()
    when(country){
        "Bangladesh" -> println("Assalamualikum!")
        "India" -> println("Namaste!")
        "Spain" -> println("Ola!")
        "Brazil" -> println("Amigo!")
        else -> println("I don't know!")
    }
}