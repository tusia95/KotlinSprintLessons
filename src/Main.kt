//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

   val stepInfo = "D2-D4;0"
   val stepInfoParts = stepInfo.split(";")
   val stepNumber = stepInfoParts[1].toInt()
   val from = stepInfoParts[0].split("-")[0]
   val to = stepInfoParts[0].split("-")[1]
   println("From: $from, To: $to, Step: $stepNumber")
}