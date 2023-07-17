package array_and_string.Reverse_String;

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
        char[] test = {'h', 'e', 'l', 'l', 'o'};
        char[] expect = {'o', 'l', 'l', 'e', 'h'};
        solution.reverseString(test);
        assertArrayEquals(expect,test);
    }


    @Test
    public void Test1() {

        char[] test = {'H','a','n','n','a','h'};
        char[] expect = {'h','a','n','n','a','H'};
        solution.reverseString(test);
        assertArrayEquals(expect,test);

    }


}



