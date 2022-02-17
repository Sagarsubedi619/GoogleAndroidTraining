fun main(){
val myFirstDice = Dice(6)
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}! and the color is ${diceRoll.diceColor="RED"}")
    val mySecondDice = Dice(20)
    println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}! and the color is ${diceRoll.diceColor="BLUE"}")
    val myCoin=Coin()
    println("Coin flib result is ${myCoin.flip()} !")
}