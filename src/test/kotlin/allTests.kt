import multiplesOf3Or5.solution
import org.junit.jupiter.api.Test
import persistenceBugger.persistence
import kotlin.test.assertEquals

class AllTests
{
    @Test
    fun `persistence bugger tests`() {
        assertEquals(3, persistence(39))
        assertEquals(0, persistence(4))
        assertEquals(2, persistence(25))
        assertEquals(4, persistence(999))
    }

    @Test
    fun `solution tests`()
    {
        assertEquals(23, solution(10))
        assertEquals(0, solution(-23))
        assertEquals(78, solution(20))
        assertEquals(9168, solution(200))
    }
}