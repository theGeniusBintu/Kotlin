var funds : Double = 100.0
val pswd = "password"

fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            // Each command goes here...
            "Balance" -> balance()
            "Deposit" -> deposit(cmd[1])
             "Withdraw" -> withdraw(cmd[1])
            else -> println("Invalid command")
        }
    }
}

fun balance (): Unit {
    println("$funds")
}

fun deposit(amountDeposit : String): Unit {
    funds += amountDeposit.toDouble()
    println("Balance after deposit is: $funds")
}

fun withdraw(amountWithdrawal : String) : Unit {

    print("Enter password: ")
   var access : String = readLine()!!
    if(access != pswd)
        println("Not so fast brvh ")
    else
        println("You withdrew $amountWithdrawal and your balance is $funds")

}


