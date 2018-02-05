import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.Test as test
import kotlin.test.assertEquals

fun taskTwo(max: Int): Int{
    /**
     * Returns the sum of the even numbers in the Fibonacci sequence (1, 2, 3, 5, 8, ...) that do not exceed max
     */
    var i: Int = 0
    var sum: Int = 0
    var FibonacciN = Fibonacci(i)

    while (FibonacciN<=max){
        if (FibonacciN%2==0){
            sum += FibonacciN
        }
        i++
        FibonacciN = Fibonacci(i)
    }
    return sum
}

fun Fibonacci(number: Int): Int {
    var FibonacciNumbers: MutableList<Int> = mutableListOf(1,2)
    if (number < 2){
        return FibonacciNumbers[number]
    } else {
        var i: Int = 2
        while (i <= number){
            FibonacciNumbers.add( FibonacciNumbers[i-1] + FibonacciNumbers[i-2])
            i++
        }
        return FibonacciNumbers[number]
    }
}

@RunWith(Parameterized::class)
class taskTwoTests(val X:Int, val Y:Int){

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Int>> {
            return listOf(
                    arrayOf(1, 0),
                    arrayOf(2, 2),
                    arrayOf(8, 10),
                    arrayOf(4000000, 4613732)
            )
        }
    }

    @test fun sumOfEvenFibonacciUpToXisY(){
        val testInput = taskTwo(X)
        val testOutput = Y

        assertEquals(testOutput, testInput)
    }
}

@RunWith(Parameterized::class)
class FibonacciTests(val X:Int, val Y:Int){

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Int>> {
            return listOf(
                    arrayOf(0, 1),
                    arrayOf(1, 2),
                    arrayOf(2, 3),
                    arrayOf(3, 5),
                    arrayOf(4, 8),
                    arrayOf(5, 13),
                    arrayOf(6, 21),
                    arrayOf(7, 34),
                    arrayOf(8, 55),
                    arrayOf(9, 89)
            )
        }
    }

    @test fun XthFibonacciNumberisY(){
        val testInput = Fibonacci(X)
        val testOutput = Y

        assertEquals(testOutput, testInput)
    }
}