import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.Test as test
import kotlin.test.assertEquals

fun taskTwo(max: Int): Int{
    /**
     * Returns the sum of the even numbers in the Fibonacci sequence (1, 2, 3, 5, 8, ...) that do not exceed max
     */
    return 0
}


@RunWith(Parameterized::class)
class taskTwoTests(val X:Int, val Y:Int){

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Int>> {
            return listOf(
                    arrayOf(1, 0)
            )
        }
    }

    @test fun sumOfEvenFibonacciUpToXisY(){
        val testInput = taskTwo(X)
        val testOutput = Y

        assertEquals(testOutput, testInput)
    }
}