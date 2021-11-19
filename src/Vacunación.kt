import java.util.*

fun main(){
    val dias = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(dias.get(0))
    println(dias.get(1))

    println("Los días de atención son los ${dias.size} de la semana")
    println()
    //para recorrer con size sino con .indices
    var aux = dias.size-1
    println("Los dias de atención en el Sanatorio son: ")
    for (count in dias.indices)
        println("* ${dias.get(count)}")

    //salto de linea y saber posición y valor de un array
    // verPosicionValor(dias)

    //definir cuantas personas se vacunaron en cada día de la semana
    var personasVacunadas = IntArray(7) {i -> calcularPersonas()}
    //mostrar Personas Vacunadas
    mostrarVacunados(dias,personasVacunadas)

}

fun mostrarVacunados(dias: Array<String>, p: IntArray) {
    println("Personas Vacunadas por dia: ")
    for (count in dias.indices){
        println("*${dias.get(count)}: ${p.get(count)}")

    }
}

fun calcularPersonas():Int {
    println("Ingresar personas por Día: ")
    return readLine()!!.toInt()
}

fun verPosicionValor(dias: Array<String>) {
    for((posicion, valor) in dias.withIndex())
        println("\n La posición es: $posicion y su valor es $valor")

}
