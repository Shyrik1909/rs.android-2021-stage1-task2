package subtask1

import java.text.SimpleDateFormat
import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {
        fun toTextDay(day: String, month: String, year: String): String {
            val formatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("ru"))
            return  try {
                LocalDate.of(year.toInt(), month.toInt(), day.toInt()).format(formatter)
            }catch (e: Exception) {
                 "Такого дня не существует"
                }
            }
        }



