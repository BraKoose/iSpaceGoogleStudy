fun main(args: Array<String>){
    val number: Int = 8
    val evenOdd = if (number % 2 == 0) " $number is even number" else "$number is not even number"
    println(evenOdd)
}