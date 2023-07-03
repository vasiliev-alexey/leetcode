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
        int[] nums = {1, 2, 3};
        int[] target = {1, 2, 4};
        assertArrayEquals(target, solution.plusOne(nums));
    }

    @Test
    public void Test1() {
        int[] nums = {4, 3, 2, 1};
        int[] target = {4, 3, 2, 2};
        assertArrayEquals(target, solution.plusOne(nums));
    }

    @Test
    public void Test2() {
        int[] nums = {9};
        int[] target = {1, 0};
        assertArrayEquals(target, solution.plusOne(nums));
    }


}



