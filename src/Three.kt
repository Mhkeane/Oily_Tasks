import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import org.junit.Test as test

fun taskThree(number: Long): Long{
    /**
    Returns the largest prime factor of number
     */
    if (number < 3){
        return number
    } else {

        var factorCandidate = number - 1L
        while (factorCandidate > 1L) {
            if (number%factorCandidate == 0L){
                return factorCandidate
            }
            factorCandidate--
        }
        return number
    }

}

@RunWith(Parameterized::class)
class taskThreeTests(val X:Long, val Y:Long){

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Long>> {
            return listOf(
                    arrayOf(1L, 1L),
                    arrayOf(2L, 2L),
                    arrayOf(4L, 2L),
                    arrayOf(6L, 3L),
                    arrayOf(9L, 3L)

            )
        }
    }

    @test fun largestFactorOfXisY(){
        val testInput = taskThree(X)
        val testOutput = Y

        assertEquals(testOutput, testInput)
    }
}