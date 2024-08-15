import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {

    @Test
    fun test() {
        assertEquals("Implementation", Lib.getEngine())
    }
}