package `100DaysOfCode`

import javax.sound.midi.Soundbank

//Multile constructors examples

class Circle( val radius: Double){
    constructor(name: String): this(2.0){
        println("in radius constructor")
    }
    constructor(diameter: Int): this(diameter/2.0){
        println("in diameter constructor")
    }

    init {
        println("Area: ${Math.PI * radius * radius}")
    }
}

class Trotro(val station: String = "Taifa Market, GPRTU TROTRO",
             val route: String = "via Haatso- Atomic Rd ",  val fare : Double = 3.8){




    init {
        val destination: String = "Atomic First"
        val landmark: String = "Palace Shopping Mall "
        println("Your Trotro Fare is : $fare , " +
                "as you head towards $destination near $landmark, " +
                "from $station" )
    }

    fun sumInt (money: Int, fare: Int): Int = money - fare

}



fun main(args : Array<String>){
    val c = Circle("9.0")
    val t = Trotro()

}