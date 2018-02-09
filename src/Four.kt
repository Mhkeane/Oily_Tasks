import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import org.junit.Test as test

fun taskFour(numDigits: Int): Int{
    /**
    Returns the largest palindrome that is made from the product of two integers of length numDigits
     */
    val largestInteger = (Math.pow(10.0,numDigits.toDouble())).toInt() - 1
    var possiblePalindromes: MutableList<Int> = mutableListOf()
    for (i in (1..largestInteger)){
        for (j in (1..largestInteger)){
            if (isPalindrome(i*j)){
                possiblePalindromes.add(i*j)
            }
        }
    }

    return possiblePalindromes.max()!!

}

fun isPalindrome(number: Int): Boolean{
    val numberString = number.toString()
    val numberLength:Int = numberString.length - 1
    for (i in 0 until (numberLength)){
        if (numberString[i] != numberString[numberLength-i])
            return false
    }
    return true
}

@RunWith(Parameterized::class)
class taskFourTests(val X:Int, val Y:Int){

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Int>> {
            return listOf(
                    arrayOf(1, 9),
                    arrayOf(2, 9009),
                    arrayOf(3, 906609)

            )
        }
    }

    @test fun largestPalindromeThatIsProductOfIntsLengthXisY(){
        val testInput = taskFour(X)
        val testOutput = Y

        assertEquals(testOutput, testInput)
    }
}

@RunWith(Parameterized::class)
class isPalindromeTests(val X:Int, val Y:Boolean){

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Any>> {
            return listOf(
                    arrayOf(1, true),
                    arrayOf(21, false),
                    arrayOf(11, true)

            )
        }
    }

    @test fun itIsYThatXIsAPalindrome(){
        val testInput = isPalindrome(X)
        val testOutput = Y

        assertEquals(testOutput, testInput)
    }
}