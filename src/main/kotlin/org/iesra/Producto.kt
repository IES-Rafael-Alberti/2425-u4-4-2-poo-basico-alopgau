class Producto(private val nombre: String, private val precio: Double, private var stock: Int) {
    override fun toString(): String {
        return "Producto: $nombre, Precio: $precio€, Stock: $stock"
    }
    fun vender(cantidad: Int) {
        if (cantidad < this.stock)
        this.stock -= cantidad
    }
    fun reabastecer(cantidad: Int) {
        this.stock += cantidad
    }

    init {
        require(precio > 0 && stock > 0)
    }
}