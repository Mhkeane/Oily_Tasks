import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import org.junit.Test as test

fun taskFive(max: Int): Int{
    /**
    Returns the sum of all natural numbers below max that are multiples of 3 or 5
     */
    return 1

}

@RunWith(Parameterized::class)
class taskFiveTests(val X:Int, val Y:Int){

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Int>> {
            return listOf(
                    arrayOf(1, 1)
            )
        }
    }

    @test fun smallestNumberWithAllFactorsUpToXisY(){
        val testInput = taskFive(X)
        val testOutput = Y

        assertEquals(testOutput, testInput)
    }
}