import kotlin.random.Random
fun main () {
    println("Intro of the game")
    challengeOne()
}

fun gameOver(){
    println("Game Over")
}

fun succes() {
    println("You won the game")
}

fun challengeOne(){
    println("Challenge 2")
    println("Riddle 1")
    println("What is the name of the bird of Harry Potter?")
    println("Choose between: Hedwig - Ronald - Hermione - Voldemort")
    val riddlesAnswers = listOf("Hedwig", "Ronald", "Hermione", "Voldemort")
    var userChoice: String?
    userChoice = readLine()
    if (userChoice == riddlesAnswers[0]) {
    //succes()
        challengeTwo()
    }
    else{
        gameOver()
    }
}

fun challengeTwo(){
    println("Challenge 2")
    println("Predict a dice roll")
    println("Choose: Low(1-3) or High(4-6)")
    val randomNumber = Random.nextInt(1, 6)
    println(randomNumber)
    var userChoice: String?
    userChoice = readLine()

    if (randomNumber <= 3 && userChoice == "Low") {
        succes()
    }
    else if (randomNumber >= 4 && userChoice == "High") {
        succes()
    }
    else {
        gameOver()
    }


}