package array_and_string.Longest_Common_Prefix;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

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
        String[] test ={"flower","flow","flight"};
        assertEquals("fl", solution.longestCommonPrefix(test));
    }


    @Test
    public void Test1() {
        String[] test ={"dog","racecar","car"};
        assertEquals("", solution.longestCommonPrefix(test));
    }



}



