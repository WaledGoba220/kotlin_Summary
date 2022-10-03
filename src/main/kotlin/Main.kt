fun  main(){

//    println("waled saied")                  ==>  Print OutPut with line
//    print("Hello ")                         ==>  Print OutPut inline

// ________________________________________________________________________________________________________________

               // This is a comment. It is not executed.

//            // ==> Comment to refer info about thing

// ________________________________________________________________________________________________________________

//
//    var  firstName =  "waled "
//    var  lastName =  "Saied"
//    var age = 21
//
//    print(firstName )
//    println(lastName)
//    println(age)

// ________________________________________________________________________________________________________________

// difference between val & var  ==> var can access value , read and update it but val access value and read it not updated data

//    val firstName = "Ali"
//      //    firstName = "waled" ==> Error Not Updated data
//   print(firstName)
//


// ________________________________________________________________________________________________________________

//    var car:String = "Volks"
//    println(car)       //  ==> provide type on Kotlin Variable

//    var numeric:Int = 123
//    println(numeric)

// ________________________________________________________________________________________________________________
//
//    // number DataType(right or decimal)
//    val  myByte:Byte = 8;
//    val  myShort:Short = 16;
//    val  myInt:Byte = 32;
//    val  myLong:Byte = 64;
//
//    val  myFloat:Float = 32.00F;
//    val  myDouble:Double = 64.00;
//
//    println(myShort.toShort())

// ________________________________________________________________________________________________________________


//    var data:String  =  "Hello World"
//    println(data.uppercase())
//    println(data.lowercase())
//
//
//    var charA:Char = 'A'
//    println(charA)
//


// ________________________________________________________________________________________________________________


//    // Deployment Variable
//
//    var name:String = "Waled Saied "
//    var age:Int = 21
//
//    println("My Name is $name and i'm $age years old")
//
//


// ________________________________________________________________________________________________________________

//
//    var dFalse:Boolean = false
//    println(dFalse)
//    println(dFalse.not())
// ________________________________________________________________________________________________________________


//    val num1:Double = 10.5
//    val num2:Double = 3.5
//    var result:Double = num1+num2
//    println(result)

    // Arithmetic Operation ==> + - * / %

// ________________________________________________________________________________________________________________

//
//    var fName:String = "Waled "
//    var lName:String = "Saied "
//    var jop:String = "Software Engineer "
//
//    var res = fName + " "+ lName + " "+ jop
//    println(res)
//
//    println("My Name is $fName $lName and my jop is ")

// ________________________________________________________________________________________________________________

//    var number:Int = 5;
//    number += 10
//    println(number) ==> result = 15 (Assignment operator += -= *= /=)
// ________________________________________________________________________________________________________________


    // ++ increment
    // -- decrement
    // ++a ==> prefix === a++ postfix

//    var a:Int = 5
//    println(a++)
//    println(++a)

// ________________________________________________________________________________________________________________
    // comparison operator (> < == !=)

//    var x:Int = 10
//    if(x < 10){
//        println("No")
//    }else {
//        println("yes")
//    }

// ________________________________________________________________________________________________________________
// if - else if - else
//    var price:Int = 5000
//    if(price == 5000){
//        println("Done")
//    }else if (price < 200){
//        println("Loss")
//    }else{
//        println("winner")
//    }
// ________________________________________________________________________________________________________________

//    var myAge = 25
//    if(myAge == 25) print("my Age is $myAge")else{print("my Age is Not $myAge")}
//
//    // Single line condition
// ________________________________________________________________________________________________________________

    // When Expression
//
//    class  User(var fName:String ,var lName:String ,)
//
//    val user = User("Waled", "Saied")
//
//    when(user.fName){
//        "Waled" -> println("This is First Name")
//        "Saied" -> println("This is Second Name")
//        else ->println("This is Not Right Person")
//    }



//    val hourOfDay = 12
//    val timeOfDay: String
//    timeOfDay = when (hourOfDay) {
//        0, 1, 2, 3, 4, 5 -> "Early morning"
//        6, 7, 8, 9, 10, 11 -> "Morning"
//        12, 13, 14, 15, 16 -> "Afternoon"
//        17, 18, 19 -> "Evening"
//        20, 21, 22, 23 -> "Late evening"
//        else -> "INVALID HOUR!"
//    }
//    println(timeOfDay)

// ________________________________________________________________________________________________________________
// For Loop
//    val values = listOf(1,2,3,4,5,6,7,8)
//    for( i in values){
//        println(i)
//    }
//
//
//    for(i in 0 until 10){
//        print(i)
//    }            // ==> print form 0 to 9

// ________________________________________________________________________________________________________________

    // While Loops ==> Check Condition first after looping
//    var x =0
//    while(x<10){
//        println(x)
//        x++
//    }

// ________________________________________________________________________________________________________________

    // do - while loop

//    var x = 0
//    do{
//        println(x)
//        x++
//    }while (x<= 10)
//    // do loop and check condition last

// ________________________________________________________________________________________________________________

    // Using Kotlin Range

//    for (i in 0.. 10){
//        println(i)
//    }
//
//
//    for (i in 0.. 20 step 2){
//        println(i)
//    }                       // step increment 2

// ________________________________________________________________________________________________________________

    // foreach looping
//
//    val names = listOf("waled","saied","khames", "moustafa")
//    names.forEach{ println(names) }

// ________________________________________________________________________________________________________________

    // check with is

//    val x = 10
//
//    if(x is Any){
//        print("yes")
//    }else{
//        print("no")
//    }

// ________________________________________________________________________________________________________________

    // type casting
//    var str1: Any = "Safe casting"
//    val str2: String? = str1 as? String     // it works
//    str1 = 11
//    // type casting not possible so returns null to str3
//    val str3: String? = str1 as? String
//    val str4: Int? = str1 as? Int          // it works
//    println(str2)
//    println(str3)
//    println(str4)
// ________________________________________________________________________________________________________________

    // Throw Exception
//    throw Exception("Throw me")

    // try == catch
//    try {
//        // code that can throw exception
//    } catch(e: ExceptionName) {
//        // catch the exception and handle it
//    }
//

    // try == catch == finally block
//    try {
//        // some exception-throwing code
//    }
//    catch (e: SomeException) {
//        // code
//    }
//    catch (e: SomeOtherException) {
//        // code
//    }
//    finally {
//        // optional
//    }
//


//
//    try{
//        var num = 10 / 0
//    }
//    catch(e: ArithmeticException){
//        println("Divide by zero not allowed")
//    }


// ________________________________________________________________________________________________________________

//
//    note : in Kotlin It is not a requirement that you put the type of the variable. The language compiler is distinguished and
//    intelligent. It can read and know the type of the variable by writing it via type inference
// ________________________________________________________________________________________________________________


    // Collections Overview  ==> Most Important
    //Collections are a common concept for most programming languages

    // listof
//    val stringList = listOf("one", "two", "three")
//    println(stringList)
//    println(stringList[0])
//
//    val intList = listOf(1, 2, 3)
//    println(intList)
//    println(intList[0])

//
//    val numbers = listOf("one", "two", "three", "four")
//    println("Number of elements: ${numbers.size}")
//    println("Third element: ${numbers.get(2)}")
//    println("Fourth element: ${numbers[3]}")
//    println("Index of element \"two\" ${numbers.indexOf("two")}")

    // setof
//    val stringSet = setOf("one", "two", "three")
//    println(stringSet)

//    // note not indexing collection

//    val intSet = setOf(1, 2, 3)
//    println(intSet)
//



    // MutableList   ==> can do ,many operations like add , remove ,update and Shuffle
//    val numbers = mutableListOf(1, 2, 3, 4)
//    numbers.add(5)
//    numbers.removeAt(1)
//    numbers[0] = 0
//    numbers.shuffle()
//    println(numbers)

    // Map <K , V>

//    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
//    println(numbersMap)
//    println(numbersMap.get("key3"))

    // MutableMap
//    val numbersMap = mutableMapOf("one" to 1, "two" to 2)
//    numbersMap.put("three", 3)
//    numbersMap["one"] = 11
//
//    println(numbersMap)

// ________________________________________________________________________________________________________________


    // Functions ==> kotlin functions are declared using the fun




}

