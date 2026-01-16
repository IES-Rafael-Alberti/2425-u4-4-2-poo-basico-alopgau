class Vehiculo(private val marca: String, private val modelo : String) {
private var kilometraje = 0.0
    fun registrarViaje(kilometros: Double) {
        this.kilometraje += kilometros
    }
    fun detalles() {
        println("$marca $modelo con $kilometraje kilómetros")
    }
}
