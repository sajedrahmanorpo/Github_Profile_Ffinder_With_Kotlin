class Circle(
val radius: Double
): Shape("Circle") {
    val pi = 3.1416
    init {
        println("$name created with radius = $radius")
        println("$name created with area = ${area()}")
        println("$name created with perimeter = ${perimeter()}")
    }
    fun area() = radius * radius * pi

    fun perimeter() = 2 * pi * radius
}