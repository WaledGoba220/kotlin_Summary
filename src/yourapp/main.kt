package yourapp

fun  main(){
//    println("Enter Your Name ?")
//    val  name = readLine()
//    println("Your Name IS $name")


    println("Enter Number 1 ? ")
    val  num1 = readLine()!!.toInt()
    println("Enter Number 2 ? ")
    val  num2 = readLine()!!.toInt()
    val result = num1 + num2
    println(result)
}