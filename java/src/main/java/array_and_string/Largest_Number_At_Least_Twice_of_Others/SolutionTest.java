package array_and_string.Largest_Number_At_Least_Twice_of_Others;

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
        int[] nums = {3,6,1,0};
        assertEquals(1, solution.dominantIndex(nums));

    }
    @Test
    public void Test1() {
        int[] nums = {1,2,3,4};
        assertEquals(-1, solution.dominantIndex(nums));

    }
    @Test
    public void Test2() {
        int[] nums = {0,0,0,1};
        assertEquals(3, solution.dominantIndex(nums));

    }

    @Test
    public void Test3() {
        int[] nums = {1,0};
        assertEquals(0, solution.dominantIndex(nums));

    }




}



