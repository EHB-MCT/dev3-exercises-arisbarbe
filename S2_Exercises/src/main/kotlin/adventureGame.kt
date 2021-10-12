fun main () {
    println("Intro of the game")
    challengeOne()
}
fun challengeOne(){
    println("Riddle 1")
    println("What is the name of the bird of Harry Potter?")
    println("Choose between: Hedwig - Ronald - Hermione - Voldemort")
    val riddlesAnswers = listOf("Hedwig", "Ronald", "Hermione", "Voldemort")
    var userChoice: String?
    userChoice = readLine()
    if (userChoice == riddlesAnswers[0]) {
    succes()
    }
    else{
        gameOver()
    }

}

fun gameOver(){
    println("Game Over")
}

fun succes() {
    println("Good job")
}