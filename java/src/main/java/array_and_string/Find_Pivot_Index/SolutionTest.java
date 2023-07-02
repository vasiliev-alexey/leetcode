package array_and_string.Find_Pivot_Index;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

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
        int[] nums = {1, 7, 3, 6, 5, 6};
        assertEquals(3, solution.pivotIndex(nums));

    }

    @Test
    public void Test1() {
        int[] nums = {1, 2, 3};
        assertEquals(-1, solution.pivotIndex(nums));

    }

    @Test
    public void Test2() {
        int[] nums = {2, 1, -1};
        assertEquals(0, solution.pivotIndex(nums));
    }


    @Test
    public void Test3() {
        int[] nums = {-1,-1,0,1,1,0};
        assertEquals(5, solution.pivotIndex(nums));
    }


}



