import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import org.junit.Test as test

fun taskOne(max: Int): Int{
    /**
     Returns the sum of all natural numbers below max that are multiples of 3 or 5
     */
    var sum: Int = 0
    var i: Int = 1

    while (i < max){
        if (i%3 == 0 || i%5 == 0){
            sum += i
        }
        i++
    }

    return sum

}

@RunWith(Parameterized::class)
class taskOneTests(val X:Int, val Y:Int){

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Int>> {
            return listOf(
                    arrayOf(4, 3),
                    arrayOf(6, 8),
                    arrayOf(10, 23),
                    arrayOf(16, 60)
            )
        }
    }

    @test fun sumUpToXisY(){
        val testInput = taskOne(X)
        val testOutput = Y

        assertEquals(testOutput, testInput)
    }
}