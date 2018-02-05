import kotlin.test.assertEquals
import org.junit.Test as test
/**import org.junit.Assert*/

fun taskOne(max: Int): Int{
    var sum: Int = 0
    var i: Int = 1

    while (i < max){
        if (i%3 == 0){
            sum += i
        }
        if (i%5 == 0){
            sum += i
        }
        i++
    }

    return sum

}

class taskOneTests(){
    @test fun sumUpTo4is3(){
        val testInput = taskOne(4)
        val testOutput = 3

        assertEquals(testOutput, testInput)
    }

    @test fun sumUpTo6is8() {
        val testInput = taskOne(6)
        val testOutput = 8

        assertEquals(testOutput, testInput)
    }

    @test fun sumUpTo10is23() {
        val testInput = taskOne(10)
        val testOutput = 23

        assertEquals(testOutput, testInput)
    }
}