fun main(){
    //println("Hello World")
    //val classmates = arrayOf("Aris", "Bert", "Dirk", "Pieter", "Marc")
    val classmates = arrayOf("Aris", "Bert", "Dirk", "Pieter", "Marc")
    for (classmate in classmates) {
        greet(classmate)
    }
}

fun greet(classmate: String) {
    println("Hello $classmate")
}