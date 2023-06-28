package t_3251_Valid_Mountain_Array;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        int[] nums = {2,1};
        assertFalse(solution.validMountainArray(nums));
    }    @Test
    public void Test1() {
        int[] nums = {3,5,5};
        assertFalse(solution.validMountainArray(nums));
    }    @Test
    public void Test2() {
        int[] nums = {0,3,2,1};
        assertTrue(solution.validMountainArray(nums));
    }

    @Test
    public void Test3() {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};
        assertFalse(solution.validMountainArray(nums));
    }




}



