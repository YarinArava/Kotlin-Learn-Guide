// there are two ways that calls the Constructor to build our Class
//1st Way
// Class of Dogs
class Dog {
    var type = "" // expect for String
    var name = "" // expect for String
    var age = 0   // expect for Number

    fun catchBall(){ // function use to perform action
        println("$name caught the ball!")
    }
}

// 2nd Way
// Class of Jobs
class Job(var name: String, var mainTool: String){

    fun jobNoise(mainTool: String){
        if (mainTool == "CocktailShaker") println("Shik-Shak-Shook")
        else println("Pew-Pew!")
    }
}

// childClass and parentClass inheritance example
// parentClass: Vehicle
open class Vehicle(val brand: String, val wheels: Int) {
    open fun drive() {
            println("$brand vehicle is driving on $wheels wheels")
    }
}
// childClass: Car
class Car(brand: String) : Vehicle(brand, 4) {

}
// childClass: Motorcycle
class Motorcycle(brand: String) : Vehicle(brand, 2) {
    override fun drive(){
        println("$brand is Zooming on $wheels wheels")
    }
}

fun main(){
    // our Dog Class contains 3 fields, properties or how you familiar with.
    // Create dog object using our class
    val dog1 = Dog()
    // Assign and Declare the fields, Attention, we need to assign values to all 3 fields.
    dog1.type = "Pitbull"
    dog1.name = "myPit"
    dog1.age = 2
    // perform dog1 catchBall
    dog1.catchBall()

    // 2nd Way
    // our Job Class contains 2 fields.
    // Create job object using our class
    val job1 = Job("BarTender", "CocktailShaker")
    val job2 = Job("policeOfficer", "Gun")
    // perform job1 jobNoise
    job1.jobNoise(job1.mainTool)

    // inheritance between parentClass and childClass
    // parentClass using drive()
    val seatVehicle = Vehicle("Seat", 4)
    seatVehicle.drive()
    // childClass using drive()
    val toyota = Car("Toyota")
    toyota.drive()
    // childClass using override drive()
    val yamaha = Motorcycle("Yamaha")
    yamaha.drive()
}