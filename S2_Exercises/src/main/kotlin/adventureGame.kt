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
    val answers = setOf<String>("Polar Bear", "Pooh Bear", "Bang Saapjen")
    println("Name a bear")
    val userAnswer = readLine()
    if(answers.contains(userAnswer)) {
        challengeTwo()
    } else {
        gameOver()
    }


    /*
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

     */
}

fun challengeTwo() {
    val diceResult = (1..6).random()
    val userAnswer = readLine()

    if (userAnswer == "low" && (1..3).contains(diceResult)) {
            challengeThree()
    } else if (userAnswer == "high" && (1..3).contains(diceResult)) {
        challengeThree()
} else {
    gameOver()
}


/*
    println("Challenge 2")
    println("Predict a dice roll")
    println("Choose: Low(1-3) or High(4-6)")
    val randomNumber = Random.nextInt(1, 6)
    println(randomNumber)
    var userChoice: String?
    userChoice = readLine()

    if (randomNumber <= 3 && userChoice == "Low") {
        //succes()
        challengeThree()
    }
    else if (randomNumber >= 4 && userChoice == "High") {
        //succes()
        challengeThree()
    }
    else {
        gameOver()
    }

 */
}

fun challengeThree(){
    println("Challenge 3")
    println("Choose your weapon")
    println("Choose: Wand - Sword - Gun")
    var userChoice: String?
    userChoice = readLine()
    if (userChoice == "Gun") {
        succes()
    }
    else if (userChoice == "Wand") {
        challengeTwo()
    }
    else {
        gameOver()
    }
}

/*
fun challengeFour(options: Array<Int>): Int {
    println("Challenge 4")
    println("Guess a number between 1 and 100")
    val userChoice = Integer.valueOf(readLine())
    if (userChoice == 53) {
        succes()
    }
    else if (userChoice < 53){
        do {
            println("The number is higher")
            userChoice
        } while (!options.contains(userChoice))
        return userChoice
    }
    else if(userChoice > 53){
        do {
            println("The number is lower")
            userChoice
        } while (!options.contains(userChoice))
        return userChoice
    }
}
 */