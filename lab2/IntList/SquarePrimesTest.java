package IntList;

import static org.junit.Assert.*;
import org.junit.Test;


public class SquarePrimesTest {
    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 12, 16, 53, 53);
        boolean changed = IntListExercises.squarePrimes(lst,false);
        assertEquals("14 -> 12 -> 16 -> 2809 -> 2809", lst.toString());
        assertTrue(changed);
    }
}
