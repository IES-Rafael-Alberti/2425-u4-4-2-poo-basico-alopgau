class Estudiante(private val nombre : String, nota: Double) {
    override fun toString(): String {
        return "Estudiante: $nombre, Nota: $nota"
    }
    var nota = nota
        set(value) {
            if (value < 0.0 || value > 10.0) {
                throw IllegalArgumentException("Nota inválida")
            }
            this.nota = value
        }

    init {
        require(nota > 0.0 && nota < 10.0)
    }
}