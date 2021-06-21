package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {
  // companion object {
  //     @JvmStatic
  //     fun main(args: Array<String>) {}
  // }
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            String::class -> {
                var result = ""
                for (i in blockA.indices) {
                    if (blockA[i] is String)
                        result +=blockA[i]
                }
                return result
            }
            Int::class -> {
                var result = 0
                for (i in blockA.indices) {
                    if (blockA[i] is Int)
                        result += (blockA[i] as Int)
                }
                return result
            }
            LocalDate::class -> {
                var result = LocalDate.MIN
                for (i in blockA.indices) {
                    if ((blockA[i] is LocalDate) && ((blockA[i] as LocalDate) > result))
                        result = (blockA[i] as LocalDate)

                }
                return result.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
            else -> throw NotImplementedError("Not implemented")
        }
    }
}
