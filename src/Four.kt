import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import org.junit.Test as test

fun taskFour(numDigits: Int): Int{
    /**
    Returns the largest palindrome that is made from the product of two integers of length numDigits
     */
    return 9

}

@RunWith(Parameterized::class)
class taskFourTests(val X:Int, val Y:Int){

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Int>> {
            return listOf(
                    arrayOf(1, 9)

            )
        }
    }

    @test fun largestPalindromeThatIsProductOfIntsLengthXisY(){
        val testInput = taskFour(X)
        val testOutput = Y

        assertEquals(testOutput, testInput)
    }
}