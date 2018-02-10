import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import org.junit.Test as test

fun taskFive(max: Int): Int{
    /**
    Returns the smallest positive number that has factors one through to max
     */
    var sum = 1
    for (i in max downTo 2){
        var possibleSum = sum
        var j = 2
        while (sum%i != 0) {
            if((possibleSum*j)%i == 0) {
                sum = possibleSum * j
            }
            j++

        }
    }
    return sum

}

@RunWith(Parameterized::class)
class taskFiveTests(val X:Int, val Y:Int){

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Int>> {
            return listOf(
                    arrayOf(1, 1),
                    arrayOf(2, 2),
                    arrayOf(3, 6),
                    arrayOf(4, 12),
                    arrayOf(10, 2520)
            )
        }
    }

    @test fun smallestNumberWithAllFactorsUpToXisY(){
        val testInput = taskFive(X)
        val testOutput = Y

        assertEquals(testOutput, testInput)
    }
}