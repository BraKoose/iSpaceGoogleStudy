package `100DaysOfCode`

fun displayMessage(msg: String, count: Int) : Unit {
    var counter = 1
    while(counter++ <= count ) {
        println(msg)
    }
}

fun getSum(values: List<Int>) : Int { // return type is Int
    var total = 0;
    for (i in values)  total += i
    return total                        // return value
}

fun bigSmall(a: Int, b:Int) : Pair<Int, Int> {
    if(a > b) return Pair(a,b)
    else {
        return Pair(b,a)
    }


}

fun sumInt (a: Int, b: Int): Int = a * b


fun main(args: Array<String>){
    displayMessage("Koose", 90)
    println(getSum(listOf(1,2,3,4,5,6)))
    var (x,y) = bigSmall(5,3)
    println(x)
    println(y)
    println(sumInt(10, 2))

}