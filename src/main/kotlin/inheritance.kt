open class Animal(protected val name: String, ) {
    fun walk(){
        println("$name can walk")
    }
}
class Cats (name: String, val type: String, val from: String): Animal(name) {
    fun cats(){
        println("$name can hunt")
    }
}
class Bird(name: String, val type: String, val from: String): Animal(name) {
    fun birds(){
        println("$name can fly")
    }
}

fun main(){
    val animal = Animal("cat")
    val jaguar = Cats("Carl", "predator", "Africa")
    val hawk = Bird("Emma", "predator", "Russia")
    val animals = listOf<Animal>(animal, jaguar, hawk)
    for (zoo in animals) {
        zoo.walk()
    }
}