package arrays.Third_Maximum_Number;

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
                3, 2, 1
        };
        var expected = 1;
        var result = solution.thirdMax(nums);
        assertEquals(result, expected);
    }


    @Test
    public void Test1() {
        int[] nums = {
                1, 2
        };
        var expected = 2;
        var result = solution.thirdMax(nums);
        assertEquals(result, expected);
    }

    @Test
    public void Test2() {
        int[] nums = {
                2, 2, 3, 1
        };
        var expected = 1;
        var result = solution.thirdMax(nums);
        assertEquals(result, expected);
    }


}



