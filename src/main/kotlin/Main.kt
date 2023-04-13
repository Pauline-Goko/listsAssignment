fun main() {

 println(evenIndices(listOf("Kenya", "Dubai", "Mexico", "Japan", "Brazil", "Britain", "Portugal", "Italy", "Ghana","Thailand")))
var height = listOf(1.143, 1.1938, 1.27, 1.397, 1.5494)
 println(averageHeight(mutableListOf(1.143, 1.1938, 1.27, 1.397, 1.5494)))


   var x =  studentDetailsList(mutableListOf(Person("Ada", 21, 49.4, 154.7),
    Person("Sonia", 23, 53.4, 164.7),
    Person("Kim", 24, 70.4, 194.7),
    Person("Dan", 19, 165.8, 187.4)))



   println(carMileageList(listOf(Car("KDA 342K", 20000.00),
    Car("KCA 862D", 32000.00),
    Car("KDD 888T", 42000.00),
    Car("KDC 975G", 124000.00))))



}

//Given a list of 10 strings, write a function
// that returns a list of the strings
//at even indices i.e index 2,4,6 etc

fun evenIndices(countries: List<String>): List<String>{
//    var x = mutableListOf<String>()
//
//    for (n in countries){
//        if (countries.indexOf(n) % 2 ==0 ){
//            x+=n
//        }
//
//    }
//    return x

    return countries.filterIndexed { index, _ -> index%2==0  }

}

//Given a list of people’s heights in metres.
//Write a function that returns
//the average height and the total height
data class  Height (var average: Double, var sum: Double)

fun averageHeight(height: List<Double>): Height {
    var sum = height.average()
    var average = height.sum()
//    var allHeight =Height(sum , average)
    return Height(sum, average)


}

//Given a list of Person objects,
//each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Person( var name: String,  var age: Int,  var height: Double,  var weight: Double)

fun studentDetailsList( student: List<Person>){
    println(student.sortedByDescending { s -> s.age })
}

//Given a list similar to the one above,
//write a function in which you will
//create 2 more people objects and
//add them to the list at one go.



//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Car(var registration: String, var mileage: Double)

fun carMileageList(transport:List<Car>): Double {
    var sum = 0.0
    for (v in transport){
        sum +=v.mileage

    }
    var average = sum/transport.size
    return average

}