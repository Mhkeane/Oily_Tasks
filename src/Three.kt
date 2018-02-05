import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import kotlin.test.assertTrue
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

@RunWith(Parameterized::class)
class primeListTests(val X:Long, val Y:Long){

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Long>> {
            return listOf(
                    arrayOf(1L, 1L),

                    arrayOf(2L, 1L),
                    arrayOf(2L, 2L),

                    arrayOf(3L, 1L),
                    arrayOf(3L, 2L),
                    arrayOf(3L, 3L),

                    arrayOf(4L, 1L),
                    arrayOf(4L, 2L),
                    arrayOf(4L, 3L),

                    arrayOf(5L, 1L),
                    arrayOf(5L, 2L),
                    arrayOf(5L, 3L),
                    arrayOf(5L, 5L)

            )
        }
    }

    @test fun primesLessThanXareY(){
        val testInput = getPrimesUpToN(X)
        val testOutput = Y

        assertTrue(testOutput in testInput)
    }
}