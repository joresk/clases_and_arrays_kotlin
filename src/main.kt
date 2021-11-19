import java.time.LocalDate

fun main(){
    var fecha1= LocalDate.now()
    var vacuna1 = Vacuna("Sputnik V", 1,fecha1)
    println("Usted se acaba de vacunar con: ")
    println("* ${vacuna1.nombre} \n * ${vacuna1.dosis} \n * ${vacuna1.fecha}")
}