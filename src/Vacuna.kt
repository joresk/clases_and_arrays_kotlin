import java.time.LocalDate
import java.util.*

class Vacuna(nombre: String, dosis:Int, fecha: LocalDate) {
    var nombre:String
    var dosis:Int
    var fecha:LocalDate
    init {
        this.nombre=nombre
        this.dosis=dosis
        this.fecha=fecha
    }
}