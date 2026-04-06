//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val number = 3
    val multiply = 1
    println("""
        | $number * $multiply = ${number * multiply}
        | $number * ${multiply + 1} = ${number * (multiply + 1)}
        | $number * ${multiply + 2} = ${number * (multiply + 2)}
        | $number * ${multiply + 3} = ${number * (multiply + 3)}
        | $number * ${multiply + 4} = ${number * (multiply + 4)}
        | $number * ${multiply + 5} = ${number * (multiply + 5)}
        | $number * ${multiply + 6} = ${number * (multiply + 6)}
        | $number * ${multiply + 7} = ${number * (multiply + 7)}
        | $number * ${multiply + 8} = ${number * (multiply + 8)}""".trimMargin())


}