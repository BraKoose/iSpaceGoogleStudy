package Day2

fun main(args: Array<String>) {

    val q = '*'

    if (q >= 'a' && q <= 'z' || q >= 'A' && q <= 'Z')
        println("$q is an alphabet.")
    else
        println("$q is not an alphabet.")
}