package suai.vladislav.letixprosto.models

import kotlinx.serialization.Serializable
import suai.vladislav.letixprosto.util.DataTime

@Serializable
data class Days(
    val `0`: Day,
    val `1`: Day,
    val `2`: Day,
    val `3`: Day,
    val `4`: Day,
    val `5`: Day,
    val `6`: Day
) {
    fun getAll(week: String, startWeeks: DataTime) =
        this.`0`.lessons.filter { it.week == week }.map { it.copy(dateTime = startWeeks.goToNNextDay(0)) } +
                this.`1`.lessons.filter { it.week == week }.map { it.copy(dateTime = startWeeks.goToNNextDay(1)) } +
                this.`2`.lessons.filter { it.week == week }.map { it.copy(dateTime = startWeeks.goToNNextDay(2)) } +
                this.`3`.lessons.filter { it.week == week }.map { it.copy(dateTime = startWeeks.goToNNextDay(3)) } +
                this.`4`.lessons.filter { it.week == week }.map { it.copy(dateTime = startWeeks.goToNNextDay(4)) } +
                this.`5`.lessons.filter { it.week == week }.map { it.copy(dateTime = startWeeks.goToNNextDay(5)) } +
                this.`6`.lessons.filter { it.week == week }.map { it.copy(dateTime = startWeeks.goToNNextDay(6)) }
}