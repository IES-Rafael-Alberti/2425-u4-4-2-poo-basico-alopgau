class Estudiante(private val nombre : String, private var nota: Double) {
    override fun toString(): String {
        return "Estudiante: $nombre, Nota: $nota"
    }
    fun setNota(nota: Double): Unit {
        if (nota > 0.0 && nota < 10.0) {
        this.nota = nota
        } else {
            throw IllegalArgumentException("Introduce una nota válida")
        }
    }
    init {
        require(nota > 0.0 && nota < 10.0)
    }
}