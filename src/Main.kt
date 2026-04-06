const val TOTAL_TABLES = 13
fun main() {

    val todayBooked = 13
    val tomorrowBooked = 9
    val isTodayTables = todayBooked < TOTAL_TABLES
    val isTommorowTables = tomorrowBooked < TOTAL_TABLES
    println(" [Доступность столиков на сегодня: $isTodayTables],\n [Доступность столиков на завтра: ${isTommorowTables}].")
}