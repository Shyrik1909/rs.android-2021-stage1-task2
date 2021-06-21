package subtask2

import java.util.*

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        //throw NotImplementedError("Not implemented")
        val stack = Stack<Char>()
        val bReversed = b.reversed()
        var i =0
        for (i in 0 until b.length) {
            val x = bReversed[i]
            stack.push(x)
        }

        for (j in 0 until a.length) {
            if (b[i] == a[j].toUpperCase()){
                stack.pop()
                i++
            }
            if(i<b.length-1 || stack.isNotEmpty()){
                continue
            }else if(stack.isEmpty()){
                return "YES"
            }
        }
        return "NO"
    }
  }
