open class Person(protected val name: String, val age: Int) {
    fun walk(){
        println("$name can walk")
    }
}
class Driver(name: String, age: Int, val experience: Int): Person(name, age) {
    fun drive(){
        println("$name can walk")
    }
}
class Teacher(name: String, age: Int,val subject: String): Person(name, age)

fun main(){
    val person1 = Person("Ian", 16)
//    person1.walk()
    val person2 = Person("Avas", 15)
//    person2.walk()
    val driver1 = Driver("Carl", 33,10)
//    driver1.walk()
//    driver1.drive()
    val teacher1 = Teacher ("Ludmila Petrova", 40, "chemist")
//    teacher1.walk()
    val people = listOf<Person>(person1, person2, driver1, teacher1)
    for (person in people) {
        person.walk()
    }
}