//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Variables Names can contain letters, digits, underscores, and dollar signs
    val name : String // declare type
    name = "kotlin" // assign value

    var MyName : String // must be declared if you want to assign values later
    MyName = "Yarin" // assign value

    println("Hello, " + MyName + "!")
    // another print method using $ operator
    println("Hello, $MyName!")

    // types of variables:
    val myNum: Byte = 0 // Byte --> -128 to 127
    val intNum: Int = 5 // Int till 2147483647 then it goes Long type
    val longNum: Long = 5 // Long
    val shortNum: Short = 5 // Short
    val floatNum: Float = 5F // Float type Must end with 'F' on the end - anyway it is safer to use Double type for more precision
    val doubleNum: Double = 5.99 // Double
    val boolean: Boolean = true // Boolean
    val letter: Char = 'Y' // Char
    val text: String = "Hello" // String
    // Example of Float number using 'E' that indicates power of 10
    val myNum1: Float = 47E3F // 47000.0

    // Example of Type Convertion
    var MyType1 : Int = 4
    var MyType2 : Long = MyType1.toLong()


    //Arrays
    var dogs = arrayOf("Poodle","Booldog", "Labrador", "Akita")
    // some examples using the array
    println(dogs[0]) // Poodle
    // Is there Poodle in the Array ?
    if ("Poodle" in dogs) {
        println("Poodle listed!")
    }
    else {
        println("No Poodle listed!")
    }

    // print the whole list of dogs using loop through
    for (dog in dogs) {
        println(dog)
    }

    // Elements in String
    var MyArray = "YarinArava" // known as String
    var MyArray2 = "Arava" // known as String
    println(MyArray[0]) // 'Y'
    println(MyArray.length) // 10
    println(MyArray.uppercase()) // YARINARAVA
    // same to lowercase
    println(MyArray.compareTo(MyArray2)) // not 0 because they are NOT equal *** we got 24 ***
    println(MyArray.indexOf(MyArray2)) // index is 5, i could write "Arava" in the brackets besides of the actual variable

    // Boolean Expression
    println(MyArray.length > MyArray2.length) // true

    // if...else conditions
    if (MyArray.length > 11) {
        println("The length of MyArray is more than 11")
    }
    else  println("The length of MyArray is less than 11")

    // another if..else option using 'val'
    val msg = if (MyArray.length > 10) "MyArray is more than 11 using val" else "MyArray is less than 11 using val"
    println(msg)

    //'When' expression: replace the write of many if..else
    val truth = true
    val result = when (truth) {
        true -> "Yes!"
        false -> "No!"
        else -> "Unknown"
    }
    println("We Like to Learn Kotlin? $result")

    //while loops:
    var i = 0
    val Loops = "WhileLoopExample"
    while (i < Loops.length) {
        print(Loops[i])
        i++
    }
}