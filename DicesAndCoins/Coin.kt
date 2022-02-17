class coin()
{
    fun flip(): String{
        val randomNumber = (1..2).random()
        if(randomNumber=1){return "Head"}
        else{return "Tails"}
    }
}