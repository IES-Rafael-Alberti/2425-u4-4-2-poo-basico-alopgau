class Libro(private val titulo: String, private val autor: String, private var numPaginas: Int, private var leido: Boolean ) {

    constructor(titulo: String, autor: String) : this(titulo,autor,100,false)  {
    }

    override fun toString(): String {
        return "Libro: ${this.titulo} por ${this.autor}, Páginas: ${this.numPaginas}, Leido: ${this.leido} "
    }
}
