fun main (){
    iSpace("Koose", 20, "Android")
    iSpaceMorning()
    iSpaceThird()
}



fun iSpace(name: String, age:Int, subject:String){
    val name = "Koose"
    var age = 10
    val subject = "Kotlin"
    println("i am $name and i am $age attend morning class to study $subject")
}

fun iSpaceMorning(name:String="Koose", age: Int= 20, subject:String = "Android"){
    println("i am $name and i am $age attend evening class to study $subject")
}

fun iSpaceThird(name: String = "Godfred", age: Int = 100, subject: String= "Android Kotlin"){
    println("i am $name and i am $age attend both class to study $subject")

}