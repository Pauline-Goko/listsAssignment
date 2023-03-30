fun main() {

 println(evenIndices(listOf("Kenya", "Dubai", "Mexico", "Japan", "Brazil", "Britain", "Portugal", "Italy", "Ghana","Thailand")))
var height = listOf(1.143, 1.1938, 1.27, 1.397, 1.5494)
 println(   averageHeight(mutableListOf(1.143, 1.1938, 1.27, 1.397, 1.5494)))
    
    studentDetailsList()

    studentsList()

    println(carMileageList())

}

//Given a list of 10 strings, write a function
// that returns a list of the strings
//at even indices i.e index 2,4,6 etc

fun evenIndices(countries: List<String>): List<String>{
    var x = mutableListOf<String>()

    for (n in countries){
        if (countries.indexOf(n) % 2 ===0 ){
            x+=n
        }

    }
    return x
}

//Given a list of people’s heights in metres.
//Write a function that returns
//the average height and the total height
data class  Height (var height: Double, var height2: Double)

fun averageHeight(height: List<Double>): Height {
    var sum = height.average()
    var average = height.sum()
    var allHeight =Height(sum , average)
    return allHeight


}

//Given a list of Person objects,
//each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)

data class Person( var name: String,  var age: Int,  var height: Double,  var weight: Double)

fun studentDetailsList(){
    var student1 = Person("Mercy", 21, 137.4, 49.4)
    var student2 = Person("Stephanie", 22, 124.46, 55.8)
    var student3 = Person("Sonia", 19, 111.76, 51.6)
    var student4 = Person("Ava", 24, 101.6, 61.5)
    var student5 = Person("Pauline", 20, 134.62, 52.1)

    var students = listOf(student1, student2, student3, student4, student5)
    println(students)

    var sorting = students.sortedByDescending { student -> student.age }
    println(sorting)

}

//Given a list similar to the one above,
//write a function in which you will
//create 2 more people objects and
//add them to the list at one go.

data class People2(var occupation: String, var gender: String)
fun studentsList() {
    var student1 = Person("Ana", 24, 137.4, 59.4)
    var student2 = Person("Stacy", 20, 134.46, 51.8)
    var student3 = Person("Sara", 18, 111.76, 55.6)
    var student4 = People2("Doctor", "Male")
    var student5 = People2("Teacher", "Female")

    var Students = listOf(student1, student2, student3, student4, student5)
    println(Students)



}

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Car(var registration: String, var mileage: Double)

fun carMileageList(): Double {
    var car1 = Car("KDA 342K", 20000.00)
    var car2 = Car("KCA 862D", 32000.00)
    var car3 = Car("KDD 888T", 42000.00)
    var car4 = Car("KDC 975G", 124000.00)


    var vehicles = listOf(car1, car2, car3, car4)
    var sum = 0.0
    for (v in vehicles){
        sum +=v.mileage

    }
    var average = sum/vehicles.size
    return average

}