import Producto

fun main() {
    val p1 = Producto("Ruedas", 90.0, 12)
    val p2 = Producto("Airbags", 50.0, 8)
    val p3 = Producto("Parabrisas", 250.0, 6)
    p1.vender(6)
    println(p1)
    p2.vender(1)
    println(p2)
    p3.vender(9)
    println(p3)
    p1.reabastecer(20)
    println(p1)
}