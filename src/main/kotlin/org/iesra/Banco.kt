import CuentaBancaria

fun main() {
    val cuenta = CuentaBancaria("Antonio")
    cuenta.ingresar(100.0)
    cuenta.retirar(50.0)
    try {
        cuenta.retirar(500.0)
    } catch (e: IllegalArgumentException) {
        println("Operación inválida")
    }
}

