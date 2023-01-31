fun main(args: Array<String>) {
    val lib1 = libro("prueba", "autor1", 1585, 10)
    val lib2 = libro("titulo2", "autor2", 485, 8)
    val lib3 = libro("titulo3", "autor3", 874, 5)
    val lib4 = libro("titulo4", "autor4", 855, 9)
    /*val lib5 = libro("titulo5", "autor5", 546, 8)*/
    val libreria = conjuntoLibros(10)

    libreria.añadir(lib1)
    libreria.añadir(lib2)
    libreria.añadir(lib3)
    libreria.añadir(lib4)
    /*libreria.añadir(lib5)*/
    println("Bienvenido a la librería ")

    var salir=false
    while (salir!=true) {
        println(
            """
        Elija que desea hacer:
        1) Añadir un libro.
        2) Eliminar un libro.
        3) Mostrar todos los libros.
        4 Modificar el tamañaño de la librería.
        0) Salir del menú.
    """.trimIndent()
        )
        var eleccion = readln().toInt()
        if (eleccion == 0) {
            break
        }
        when (eleccion) {
            1 -> {
                println("Dime el título")
                var añadetitulo = readln().toString()
                println("Dime el autor ")
                var añadeautor = readln().toString()
                println("Dime las páginas que tiene el libro ")
                var añadepaginas = readln().toInt()
                println("Dime del 1 al 10 la valoración del libro ")
                var añadevaloracion = readln().toInt()
                var añadelibro = libro(añadetitulo, añadeautor, añadepaginas, añadevaloracion)
            }

            2 -> {
                println("Dime el título del libro que quieres borrar ")
                var elección = readln().toString()
                libreria.eliminar(elección)
            }

            3 -> {libreria.mostrar()
                println("----------------------------------------------------------")
            }
            4-> {
                println("dime el nuevo tamaño de la librería:")
                libreria.numMaxLibros= readln().toInt()
            }

            0->salir=true
        }
    }
}


