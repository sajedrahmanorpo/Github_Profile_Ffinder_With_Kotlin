fun main(){
    println("=== Test 1: Valid Initial Balance ===")
    val acc1 = BankAccount("Sadia Aditiya", "ACC-1001", 5000.0)
    acc1.displayInfo()

    println("\n--- Operations ---")
    acc1.deposit(200.0)
    acc1.withdraw(6000.0)
    acc1.withdraw(2200.0)

    println("=== Test 2: Negative Initial Balance ===")
    val acc2 = BankAccount("Sajed Rahman", "ACC-1002", -1500.0)
    acc2.displayInfo()

}