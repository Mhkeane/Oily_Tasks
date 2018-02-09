import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertTrue

fun getPrimesUpToN(number: Long): MutableList<Long>{
    var primes : MutableList<Long> = mutableListOf(1L,2L)
    primes.addAll(3..number step 2)
    var i: Int = 2
    var nextPrime = 3L

    while (i<primes.size){
        primes.removeAll { it % nextPrime == 0L && it > nextPrime}
        nextPrime = primes[i]
        i++
    }
    return primes
}

@RunWith(Parameterized::class)
class primeListTests(val X:Long, val Y:Long){

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Long>> {
            return listOf(
                    arrayOf(2L, 2L),

                    arrayOf(3L, 2L),
                    arrayOf(3L, 3L),

                    arrayOf(4L, 2L),
                    arrayOf(4L, 3L),

                    arrayOf(5L, 2L),
                    arrayOf(5L, 3L),
                    arrayOf(5L, 5L)

            )
        }
    }

    @Test
    fun primesLessThanXareY(){
        val testInput = getPrimesUpToN(X)
        val testOutput = Y

        assertTrue(testOutput in testInput)
    }
}