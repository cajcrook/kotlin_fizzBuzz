import kotlin.test.assertEquals
import kotlin.test.Test

class FizzbuzzTest {

    @Test
    fun divisibleby3and5returnsFizzbuzz() {
        val result = fizzbuzz(15)
//        println(" - - - here: ${fizzbuzz(15)}")
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", result)
    }

    @Test
    fun divisibleby3returnsFizz() {
        val result = fizzbuzz(3)
        assertEquals("1, 2, Fizz", result)
    }

    @Test
    fun divisibleby5returnsBuzz() {
        val result = fizzbuzz(5)
        assertEquals("1, 2, Fizz, 4, Buzz", result)
    }
    @Test
    fun number4returnnumber4() {
        val result = fizzbuzz(4)
        assertEquals("1, 2, Fizz, 4", result)
    }

    @Test
    fun divisibleby3returnsFizz2() {
//        println(" - - - here: ${fizzbuzz(3)}")
        assert(fizzbuzz(3) == "1, 2, Fizz")
    }
    @Test
    fun testupto6() {
//        println(" - - - here: ${fizzbuzz(3)}")
        assert(fizzbuzz(6) == "1, 2, Fizz, 4, Buzz, Fizz")
    }

}
