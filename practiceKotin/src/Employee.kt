open class Employee(
    val name: String,
    val baseSalary: Double
) {
    open fun calculateSalary(): Double{
        return baseSalary
    }
    open fun getDetails(){
        println("Name: $name")
        println("Base Salary: $$baseSalary")
        println("Total Calculated Salary: $${calculateSalary()}")
    }
}