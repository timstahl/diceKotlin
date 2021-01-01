fun main() {
    val myFirstDice = Dice(6, "red")
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")
    println("Your dice is colored: ${myFirstDice.colors}!")
    
    val mySecondDice = Dice(20, "yellow")
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
    println("Your dice is colored: ${mySecondDice.colors}!")
}

class Dice (val numSides: Int, val colors: String) {

    fun roll(): Int {
        val randomNumber = (1..numSides).random()
        return randomNumber
    }
    
    fun color(): String {
        val color = colors
        return colors
    }
}
