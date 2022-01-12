package Day2

fun main(args: Array<String>) {
    val lambdaFun:(String)->Unit  = { name :String->print(name)}
    val name :String = "iSpace Android kotlin Class "
    greetUser(name , lambdaFun)
}
fun greetUser(name :String, greet: (String)->Unit) {
    print("Merry Christmas ")
    greet(name)
}