//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Primer video
    var edad2 = "45"
    print("Transformando dato: ${edad2.toDouble()}")
    val nombre = "Hello World"
    val apellido = "with kotlin"
    var edad : Int? = null
    edad = 12
    edad?.let {
        print("Este valor no viene vacio")
    }
    edad = 14
    val resultado= nombre.plus(apellido).plus(" ").plus(edad)
    println("Iniciando con kotlin: $resultado")

    var Variable : String = "Mi primer variable en string"

}