package `100DaysOfCode`

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

fun main(args : Array<String>){
    val c = Circle("9.0")
}