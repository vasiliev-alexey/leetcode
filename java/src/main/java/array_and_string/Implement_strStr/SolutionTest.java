package array_and_string.Implement_strStr;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

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
        String one = "sadbutsad";
        String two = "sad";
        assertEquals(0,  solution.strStr(one, two));
    }


    @Test
    public void Test1() {
        String one = "leetcode";
        String two = "leeto";
        assertEquals(-1,  solution.strStr(one, two));
    }



}



