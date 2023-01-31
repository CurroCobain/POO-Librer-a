class conjuntoLibros(numMaxLibros:Int) {
    val conjuntoLibros= mutableListOf<libro>()
    var numMaxLibros=numMaxLibros
        get(): Int{
            return field
        }set(valor: Int){
            if (valor < 1){
                println("El tamaño mínimo es de 1")
            }else{
                field=valor
            }
    }

    fun tamaño(numMaxLibros: Int){
        println("Dime  el nuevo tamaño de la librería:  ")
        val nuevoTamaño= readln().toInt()

    }

    fun añadir(libro: libro) {
        if (conjuntoLibros.size < numMaxLibros) {
            conjuntoLibros.add(libro)
        }else{
            println("Máximo número de libros en la librería alcanzado")}
    }

    fun eliminar(eleccion:String){
        for (l in conjuntoLibros)
            if (l.titulo.equals(eleccion)){
                conjuntoLibros.remove(l)
            break}
    }

    fun mostrar(){
        for (l in conjuntoLibros){
            println(l)
        }
        println(" El número máximo de libros de esta librería es: $numMaxLibros")}
}

