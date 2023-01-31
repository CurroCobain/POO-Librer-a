class libro(titulo: String, autor: String, paginas: Int, valoracion: Int){
    var titulo=titulo
        get(): String{
            return field
        }set(valor: String){
            if (valor.length > 50){
                field=valor
            }
        }
    var valoracion=valoracion
        get(): Int{
            return field
        }set(valor: Int){
            if (valor in 1..10)
                field=valor
        }
    var autor=autor
        get(): String{
            return field
        }set(valor: String){
            if (valor.length>50){
                field=valor
            }
        }
    var paginas=paginas
        get(): Int{
            return field
        }set(valor: Int){
            if (valor < 99999){
                field=valor
            }
        }
    init {
        require( valoracion in 1..10){"La valoración debe ser entre 1 y 10 "}
    }
    override fun toString(): String {
        return "El titulo es:'$titulo', El autor es:'$autor', paginas=$paginas, valoracion=$valoracion"
    }
                /* Esta versión modifica el toString()*/
}