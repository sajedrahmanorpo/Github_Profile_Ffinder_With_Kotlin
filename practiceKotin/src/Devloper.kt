class Devloper(
    name: String,
    baseSalary: Double,
    val programmingLanguage: String
) : Employee(name, baseSalary) {
    override fun calculateSalary(): Double {
        val bonus = baseSalary * 0.10
        return baseSalary + bonus
    }

    override fun getDetails() {
        println("")
    }
}