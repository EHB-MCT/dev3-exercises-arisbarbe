fun main(){
    val options = arrayOf("rock", "paper", "scissors")
    val aiChoice = options.random()
    val userChoice = getUserChoice(options)
    println("Choice of PC: $aiChoice")
    println("Choice of user: $userChoice")
    determineWinner(aiChoice, userChoice)
}

fun getUserChoice(options: Array<String>): String?{
    var userChoice: String?
    do {
        println("Make your choice: rock - paper - scissors")
        userChoice = readLine()
    } while (!options.contains(userChoice))
    return userChoice
}

fun determineWinner(aiChoice: String, userChoice: String?) {
    if(aiChoice == userChoice) {
        println("It's a draw")
        return
    }
    val winMessage = "You've won"
    val loseMessage = "You've lost"

    when(aiChoice) {
        "rock" -> if(userChoice == "paper") println(winMessage) else println(loseMessage)
        "paper" -> if(userChoice == "scissors") println(winMessage) else println(loseMessage)
        "scissors" -> if(userChoice == "rock") println(winMessage) else println(loseMessage)
    }
}