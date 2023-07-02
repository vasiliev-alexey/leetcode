package arrays.t_527_searching_for_items_in_an_array;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

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
        int[] nums = {10,2,5,3};
        assertTrue(solution.checkIfExist(nums));
    }
    @Test
    public void Test1() {
        int[] nums = {3,1,7,11};
        assertFalse(solution.checkIfExist(nums));
    }
    @Test
    public void Test2() {
        int[] nums = {7,15,3,4,30};
        assertTrue(solution.checkIfExist(nums));
    }
    @Test
    public void Test3() {
        int[] nums = {-2,0,10,-19,4,6,-8};
        assertFalse(solution.checkIfExist(nums));
    }



}



