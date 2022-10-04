fun  main(){

    println("waled saied")                  ==>  Print OutPut with line
    print("Hello ")                         ==>  Print OutPut inline

 ________________________________________________________________________________________________________________

                This is a comment. It is not executed.

            // ==> Comment to refer info about thing

 ________________________________________________________________________________________________________________


    var  firstName =  "waled "
    var  lastName =  "Saied"
    var age = 21

    print(firstName )
    println(lastName)
    println(age)

 ________________________________________________________________________________________________________________

 difference between val & var  ==> var can access value , read and update it but val access value and read it not updated data

    val firstName = "Ali"
      //    firstName = "waled" ==> Error Not Updated data
   print(firstName)



 ________________________________________________________________________________________________________________

    var car:String = "Volks"
    println(car)       //  ==> provide type on Kotlin Variable

    var numeric:Int = 123
    println(numeric)

 ________________________________________________________________________________________________________________

    // number DataType(right or decimal)
    val  myByte:Byte = 8;
    val  myShort:Short = 16;
    val  myInt:Byte = 32;
    val  myLong:Byte = 64;

    val  myFloat:Float = 32.00F;
    val  myDouble:Double = 64.00;

    println(myShort.toShort())

 ________________________________________________________________________________________________________________


    var data:String  =  "Hello World"
    println(data.uppercase())
    println(data.lowercase())


    var charA:Char = 'A'
    println(charA)



 ________________________________________________________________________________________________________________


    // Deployment Variable

    var name:String = "Waled Saied "
    var age:Int = 21

    println("My Name is $name and i'm $age years old")




 ________________________________________________________________________________________________________________


    var dFalse:Boolean = false
    println(dFalse)
    println(dFalse.not())
 ________________________________________________________________________________________________________________


    val num1:Double = 10.5
    val num2:Double = 3.5
    var result:Double = num1+num2
    println(result)

     Arithmetic Operation ==> + - * / %

 ________________________________________________________________________________________________________________


    var fName:String = "Waled "
    var lName:String = "Saied "
    var jop:String = "Software Engineer "

    var res = fName + " "+ lName + " "+ jop
    println(res)

    println("My Name is $fName $lName and my jop is ")

 ________________________________________________________________________________________________________________

    var number:Int = 5;
    number += 10
    println(number) ==> result = 15 (Assignment operator += -= *= /=)
 ________________________________________________________________________________________________________________


     ++ increment
     -- decrement
     ++a ==> prefix === a++ postfix

    var a:Int = 5
    println(a++)
    println(++a)

 ________________________________________________________________________________________________________________
     comparison operator (> < == !=)

    var x:Int = 10
    if(x < 10){
        println("No")
    }else {
        println("yes")
    }

 ________________________________________________________________________________________________________________
 if - else if - else
    var price:Int = 5000
    if(price == 5000){
        println("Done")
    }else if (price < 200){
        println("Loss")
    }else{
        println("winner")
    }
 ________________________________________________________________________________________________________________

    var myAge = 25
    if(myAge == 25) print("my Age is $myAge")else{print("my Age is Not $myAge")}

    // Single line condition
 ________________________________________________________________________________________________________________

     When Expression

    class  User(var fName:String ,var lName:String ,)

    val user = User("Waled", "Saied")

    when(user.fName){
        "Waled" -> println("This is First Name")
        "Saied" -> println("This is Second Name")
        else ->println("This is Not Right Person")
    }



    val hourOfDay = 12
    val timeOfDay: String
    timeOfDay = when (hourOfDay) {
        0, 1, 2, 3, 4, 5 -> "Early morning"
        6, 7, 8, 9, 10, 11 -> "Morning"
        12, 13, 14, 15, 16 -> "Afternoon"
        17, 18, 19 -> "Evening"
        20, 21, 22, 23 -> "Late evening"
        else -> "INVALID HOUR!"
    }
    println(timeOfDay)

 ________________________________________________________________________________________________________________
 For Loop
    val values = listOf(1,2,3,4,5,6,7,8)
    for( i in values){
        println(i)
    }


    for(i in 0 until 10){
        print(i)
    }            // ==> print form 0 to 9

 ________________________________________________________________________________________________________________

     While Loops ==> Check Condition first after looping
    var x =0
    while(x<10){
        println(x)
        x++
    }

 ________________________________________________________________________________________________________________

     do - while loop

    var x = 0
    do{
        println(x)
        x++
    }while (x<= 10)
    // do loop and check condition last

 ________________________________________________________________________________________________________________

     Using Kotlin Range

    for (i in 0.. 10){
        println(i)
    }


    for (i in 0.. 20 step 2){
        println(i)
    }                       // step increment 2

 ________________________________________________________________________________________________________________

     foreach looping

    val names = listOf("waled","saied","khames", "moustafa")
    names.forEach{ println(names) }

 ________________________________________________________________________________________________________________

     check with is

    val x = 10

    if(x is Any){
        print("yes")
    }else{
        print("no")
    }

 ________________________________________________________________________________________________________________

     type casting
    var str1: Any = "Safe casting"
    val str2: String? = str1 as? String     // it works
    str1 = 11
    // type casting not possible so returns null to str3
    val str3: String? = str1 as? String
    val str4: Int? = str1 as? Int          // it works
    println(str2)
    println(str3)
    println(str4)
 ________________________________________________________________________________________________________________

     Throw Exception
    throw Exception("Throw me")

     try == catch
    try {
        // code that can throw exception
    } catch(e: ExceptionName) {
        // catch the exception and handle it
    }


     try == catch == finally block
    try {
        // some exception-throwing code
    }
    catch (e: SomeException) {
        // code
    }
    catch (e: SomeOtherException) {
        // code
    }
    finally {
        // optional
    }




    try{
        var num = 10 / 0
    }
    catch(e: ArithmeticException){
        println("Divide by zero not allowed")
    }


 ________________________________________________________________________________________________________________


    note : in Kotlin It is not a requirement that you put the type of the variable. The language compiler is distinguished and
    intelligent. It can read and know the type of the variable by writing it via type inference
 ________________________________________________________________________________________________________________


     Collections Overview  ==> Most Important
    Collections are a common concept for most programming languages

     listof
    val stringList = listOf("one", "two", "three")
    println(stringList)
    println(stringList[0])

    val intList = listOf(1, 2, 3)
    println(intList)
    println(intList[0])


    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")

     setof
    val stringSet = setOf("one", "two", "three")
    println(stringSet)

    // note not indexing collection

    val intSet = setOf(1, 2, 3)
    println(intSet)




     MutableList   ==> can do ,many operations like add , remove ,update and Shuffle
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)

     Map <K , V>

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    println(numbersMap)
    println(numbersMap.get("key3"))

     MutableMap
    val numbersMap = mutableMapOf("one" to 1, "two" to 2)
    numbersMap.put("three", 3)
    numbersMap["one"] = 11

    println(numbersMap)

 ________________________________________________________________________________________________________________


     Functions ==> kotlin functions are declared using the fun


    fun printMyName() {
        println("My name is Waled Saied.")
    }

    printMyName()   // ==>  Calling Function name



    fun printMultipleOfFive(value: Int) {
        println("$value * 5 = ${value * 5}")
    }
    printMultipleOfFive(10) // ==>  Parameter Function



    fun multiply(number: Int, multiplier: Int): Int {
        return number * multiplier
    }

    multiply(5,2)  // ==>  return Value



    var count = 0
    fun rec(){
        count++;
        if(count<=5){
            println("hello "+count);
            rec();
        }
    }

    rec()        ==> Recursion Function


 ________________________________________________________________________________________________________________
      Nullability

    var a: String = "abc" // Regular initialization means non-null by default
    a = null // compilation error

    var b: String? = "Waled" // can be set to null
    b = null // ok
    print(b)

    val b: String? = "Waled"
    if (b != null && b.length > 0) {
        print("String of length ${b.length}")
    } else {
        print("Empty string")
    }


    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()                 // ==>  Collections of a nullable type



 ________________________________________________________________________________________________________________

     OOP
   Kotlin Class and Object
Kotlin supports both object oriented programming (OOP) as well as functional programming. Object oriented programming
 is based on real time objects and classes. Kotlin also support pillars of OOP language such as encapsulation,
 inheritance and polymorphism.

    Kotlin Class
    Kotlin class is similar to Java class, a class is a blueprint for the objects which have common properties.
    Kotlin classes are declared using keyword class. Kotlin class has a class header which specifies its type parameters,
    constructor etc. and the class body which is surrounded by curly braces.


    class account {
        var acc_no: Int = 0
        var name: String? = null
        var amount: Float = 0f

        fun deposit() {
            //deposite code
        }

        fun withdraw() {
            // withdraw code
        }

        fun checkBalance() {
            //balance check code
        }

    }


    Kotlin Object
            Object is real time entity or may be a logical entity which has state and behavior. It has the characteristics:

    state: it represents value of an object.
    behavior: it represent the functionality of an object.
    Object is used to access the properties and member function of a class. Kotlin allows to create multiple object of a class.



    var obj1 = className()
    var obj2 = className()       // Create an object




    Kotlin Constructor
            In Kotlin, constructor is a block of code similar to method. Constructor is declared with the same name as the class followed by parenthesis '()'. Constructor is used to initialize the variables at the time of object creation.

    Types of Kotlin constructors
            There are two types of constructors in Kotlin:

    Primary constructor
            Secondary constructor
            There is only one primary constructor in a Kotlin class whereas secondary constructor may be one or more.

    Kotlin primary constructor
    Primary constructor is used to initialize the class. It is declared at class header. Primary constructor code is surrounded by parentheses with optional parameter.
    Play Videox


    When the object of myClasss is created, it initializes name and id with "Ashu" and "101" respectively.
    class myClass(val name: String, var id: Int) {
    }
    fun main(args: Array<String>){
        val myclass = myClass ("Ashu", 101)

        println("Name = ${ myclass.name}")
        println("Id = ${ myclass.id}")
    }


OutPut : Name = Ashu
         Id = 101



    Kotlin Inheritance
            Inheritance is an important feature of object oriented programming language. Inheritance allows to inherit the feature of existing class (or base or parent class) to new class (or derived class or child class).
    The main class is called super class (or parent class) and the class which inherits the superclass is called subclass (or child class). The subclass contains features of superclass as well as its own.
    The concept of inheritance is allowed when two or more classes have same properties. It allows code reusability. A derived class has only one base class but may have multiple interfaces whereas a base class may have one or more derived classes.
    In Kotlin, the derived class inherits a base class using: operator in the class header (after the derive class name or constructor)


    open class Employee(name: String, age: Int, salary: Float) {
        // code of employee
    }

    class Programmer(name: String, age: Int, salary: Float): Employee(name,age,salary) {
        // code of programmer
    }

    class Salesman(name: String, age: Int, salary: Float): Employee(name,age,salary) {
        // code of salesman
    }




    Kotlin Abstract class
    A class which is declared with abstract keyword is known as abstract class. An abstract class cannot be instantiated. Means,
    we cannot create object of abstract class. The method and properties of abstract class are non-abstract unless they are explicitly declared as abstract.


    Abstract classes are partially defined classes, methods and properties which are no implementation but must be implemented into derived class.
    If the derived class does not implement the properties of base class then is also meant to be an abstract class.


    abstract class Car{
        abstract fun run()
    }
    class Honda: Car(){
        override fun run(){
            println("Honda is running safely..")
        }
    }
    fun main(args: Array<String>){
        val obj = Honda()
        obj.run();
    }



    Kotlin Data class
    Data class is a simple class which is used to hold data/state and contains standard functionality.
    A data keyword is used to declare a class as a data class.



    data class User(var name: String, var id: Int, var email: String)
    fun main(agrs: Array<String>) {
        val u = User("Ashu", 101, "mymail@mail.com")
        println(u)
    }

    Kotlin Interface
            An interface is a blueprint of class.
    Kotlin interface is similar to Java 8. It contains abstract method declarations as well as implementation of method.

    interface MyInterface  {
        var id: Int            // abstract property
        fun absMethod():String    // abstract method
        fun doSomthing() {
            println("MyInterface doing some work")
        }
    }
    class InterfaceImp : MyInterface {
        override var id: Int = 101
        override fun absMethod(): String{
            return "Implementing abstract method.."
        }
    }
    fun main(args: Array<String>) {
        val obj = InterfaceImp()
        println("Calling overriding id value = ${obj.id}")
        obj.doSomthing()
        println(obj.absMethod())
    }




    Kotlin Sealed Class
    Sealed class is a class which restricts the class hierarchy. A class can be declared as sealed class using "sealed" keyword before the class name. It is used to represent restricted class hierarchy.
    Sealed class is used when the object have one of the types from limited set, but cannot have any other type.
    The constructors of sealed classes are private in default and cannot be allowed as non-private.

    sealed class Shape{
        class Circle(var radius: Float): Shape()
        class Square(var length: Int): Shape()
        class Rectangle(var length: Int, var breadth: Int): Shape()
        object NotAShape : Shape()
    }


    sealed class Shape{
        class Circle(var radius: Float): Shape()
        class Square(var length: Int): Shape()
        class Rectangle(var length: Int, var breadth: Int): Shape()
        //  object NotAShape : Shape()
    }

    fun eval(e: Shape) =
        when (e) {
            is Shape.Circle ->println("Circle area is ${3.14*e.radius*e.radius}")
            is Shape.Square ->println("Square area is ${e.length*e.length}")
            is Shape.Rectangle ->println("Rectagle area is ${e.length*e.breadth}")
            //else -> "else case is not require as all case is covered above"
            //  Shape.NotAShape ->Double.NaN
        }
    fun main(args: Array<String>) {

        var circle = Shape.Circle(5.0f)
        var square = Shape.Square(5)
        var rectangle = Shape.Rectangle(4,5)

        eval(circle)
        eval(square)
        eval(rectangle)
    }




    Kotlin Extension Function
    Kotlin extension function provides a facility to "add" methods to class without inheriting a class or using any type of design pattern. The created extension functions are used as a regular function inside that class.

    The extension function is declared with a prefix receiver type with method name.

    class Student{
        fun isPassed(mark: Int): Boolean{
            return mark>40
        }
    }
    fun Student.isExcellent(mark: Int): Boolean{
        return mark > 90
    }
    fun main(args: Array<String>){
        val student = Student()
        val passingStatus = student.isPassed(55)
        println("student passing status is $passingStatus")

        val excellentStatus = student.isExcellent(95)
        println("student excellent status is $excellentStatus")
    }
}




