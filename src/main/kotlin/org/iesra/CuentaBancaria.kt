class CuentaBancaria(private val titular: String) {
    private var saldo = 0.0
    fun ingresar(cantidad: Double): Unit {
        this.saldo += cantidad
        println("Saldo después de la operación: ${this.saldo}")
    }

    fun retirar(cantidad: Double): Unit {
        if (cantidad < this.saldo) {
            this.saldo -= cantidad
            println("Saldo después de la operación: ${this.saldo}")
        } else {
            throw IllegalArgumentException("Operación inválida. No cuentas con suficiente saldo en tu cuenta")
        }
    }
}
