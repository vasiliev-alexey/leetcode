package arrays.Height_Checker;

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
        int[] nums = {
                1, 1, 4, 2, 1, 3
        };
        var expected = 3;
        var result = solution.heightChecker(nums);
        assertEquals(expected , result );
    }

    @Test
    public void Test1() {
        int[] nums = {
                5, 1, 2, 3, 4
        };
        var expected = 5;
        var result = solution.heightChecker(nums);
        assertEquals(result, expected);
    }


    @Test
    public void Test2() {
        int[] nums = {
                1, 2, 3, 4, 5
        };
        var expected = 0;
        var result = solution.heightChecker(nums);
        assertEquals(result, expected);
    }


}



