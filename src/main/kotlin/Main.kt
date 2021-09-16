fun main(){
 var a = "A" //Kotlin da tipo automático
 val b = "Buenas noches"
 val nt:String = "3"
 var error:String? = "Hola"
 //Para poder tomar null seria var nt: String? = "A"
println("La variable a es una $a y la constante b es una $b")
tocahuevos(error)
println("${System.identityHashCode(error)} es la referencia en memoria de $error")
}

fun tocahuevos(s : String?){
 println("La longitud de $s es ${s!!.length}")
}