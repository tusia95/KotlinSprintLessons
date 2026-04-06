//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val weatherIsSunny = true
    val isTentOpened = true
    val humidity = 20
    val season = "Winter"
    println("Благоприятные ли условия сейчас для роста бобовых? ${weatherIsSunny && isTentOpened && humidity == 20 && season != "Winter"}")
}