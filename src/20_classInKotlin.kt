import kotlin.math.sqrt

fun main(){
    val myRect = Rectangle(4.0, 7.0)
    println("The area of this rectangle ${myRect.area()}")
    println("The perimeter of this rectangle ${myRect.perimeter()}")
    println("Is rectangle is square ${myRect.isSquare()}")
    println("\n")
    val myCircle = Circle(5.0)
    println("The area of this circle ${myCircle.area()}")
    println("The perimeter of this circle ${myCircle.perimeter()}")
    println("\n")
    val myTriangle = Triangle(3.0, 4.0, 5.0)
}