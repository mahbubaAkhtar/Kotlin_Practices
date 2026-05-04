class BankAccount {
    //take accountHolder variable
    private var accountHolder: String = ""      //no one can be access

    // just ei class er vetorei access kora jabe
    // access er jonno setter getter method use korte hoi
    //setter method for accountHolder variable
    fun setAccountHolder(name: String) {
        if (name.isNotEmpty()) {
            accountHolder = name;
        } else {
            println("Please enter your name for your account")
        }
    }

    //getter method
    fun getAccountHolder(): String {
        return accountHolder
    }

    //take another balance variable
    private var balance: Double = 0.0           //no one can be access
                                                // just ei class er vetorei access kora jabe
                                                // access er jonno setter getter method use korte hoi
                                                // setter method for balance
    fun deposit(amount: Double) {
        if (amount > 0) {
//            balance = balance + amount;
            balance += amount;
        } else {
            println("Please enter your amount for your account")
        }
    }

    //getter method
    fun getBalance(): Double {
        return balance
    }
}

fun main(){
    //create a account object for BankAccount class
    val account = BankAccount()
    account.setAccountHolder("Mahbuba AKhtar")
    println("Account Holder : ${account.getAccountHolder()}")

    account.deposit(1000.0)
    println("Current Balance : ${account.getBalance()}")
}