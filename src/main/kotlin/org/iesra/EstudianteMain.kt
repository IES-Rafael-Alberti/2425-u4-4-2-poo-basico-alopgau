import Estudiante
fun main() {
 val est1 = Estudiante("Carlos",8.0)
    try {
    val est2 = Estudiante("Oswaldo",15.0)
    println(est2)
    } catch (e: IllegalArgumentException) {
    println("Nota inválida")
    }
 val est3 = Estudiante("Pepe",2.0)
    try {

 val est4 = Estudiante("Juan",11.0)
        println(est4)
    } catch (e: IllegalArgumentException) {
        println("Nota inválida")
    }
    println(est1)
    println(est3)
}