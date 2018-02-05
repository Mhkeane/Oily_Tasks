import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import org.junit.Test as test

fun taskThree(number: Int): Int{
    /**
    Returns the largest prime factor of number
     */
    if (number < 3){
        return number
    } else {

        var factorCandidate = number - 1
        while (factorCandidate > 1) {
            if (number%factorCandidate == 0){
                return factorCandidate
            }
            factorCandidate--
        }
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
                    arrayOf(4, 2),
                    arrayOf(6, 3),
                    arrayOf(9, 3)

            )
        }
    }

    @test fun largestFactorOfXisY(){
        val testInput = taskThree(X)
        val testOutput = Y

        assertEquals(testOutput, testInput)
    }
}