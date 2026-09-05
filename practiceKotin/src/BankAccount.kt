class BankAccount(
    val accountHolderName: String,
    val accountNumber: String,
    initialBalance: Double = 0.0
) {
    //balance tracker
    var balance: Double = initialBalance
    init {
        if(initialBalance < 0.0){
            println("Initial balance cannot be negative! Setting balance to 0.0")
            balance = 0.0
        }
    }

    //taka deposit
    fun deposit(amount: Double){
        if(amount > 0){
            balance += amount
            println("Successfully deposited $amount. Current Balance: $balance")
        }else{
            println("Deposited amount must be greater then 0!")
        }
    }

    //Taka withdraw
    fun withdraw(amount: Double){
        if(amount <= 0){
            println("Withdrawal amount must be greater then 0!")
        }else if(amount > balance){
            println("Insufficient Balance!")
        }else{
            balance -= amount
            println("Successfully withdraw $amount. Current Balance: $balance")
        }
    }

    //Info display
    fun displayInfo(){
        println("--- Account Details ---")
        println("Account Holder: $accountHolderName")
        println("Account Number: $accountNumber")
        println("Current Balance: $balance")
    }
}