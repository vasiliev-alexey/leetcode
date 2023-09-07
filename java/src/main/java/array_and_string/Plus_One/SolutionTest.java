package array_and_string.Plus_One;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Rule
    public Timeout globalTimeout = new Timeout(200);
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test0() {
        String one = "11";
        String two = "1";
        assertEquals("100", solution.addBinary(one, two));
    }


    @Test
    public void Test1() {
        String one = "1010";
        String two = "1011";
        assertEquals("10101", solution.addBinary(one, two));
    }



}



