fun main() {
    println("Please enter your age:")
//    val userInput = readLine()
//    if (userInput != null){
//        if(userInput.toInt() > 50){
//            println("You are really really old")
//        }else if(userInput.toInt() > 18){
//            println("Your are an adult")
//        }else{
//            println("You are a child")
//        }
//    }
//}
    val age = readLine()?.toInt()

    if (age != null) {
        if (age >= 0 && age < 18) {
            println("You're not an adult yet")
        } else if (age >= 18 && age <= 65) {
            println("You're an adult")
        } else {
            println("You are really really old")
        }
    }
}