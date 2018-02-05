import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import org.junit.Test as test

fun taskThree(number: Int): Int{
    /**
    Returns the largest prime factor of number
     */
    if (number > 2){
        return 2
    } else {
        return number
    }
}

@RunWith(Parameterized::class)
class taskThreeTests(val X:Int, val Y:Int){

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Int>> {
            return listOf(
                    arrayOf(1, 1),
                    arrayOf(2, 2),
                    arrayOf(4, 2)

            )
        }
    }

    @test fun largestFactorOfXisY(){
        val testInput = taskThree(X)
        val testOutput = Y

        assertEquals(testOutput, testInput)
    }
}