package arrays.t_3247_Remove_Element;

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
        int[] nums1 = {3, 2, 2, 3};
        var val = 3;
        var target = 2;
        assertEquals(solution.removeElement(nums1, val), target);
    }
    @Test
    public void Test1() {
        int[] nums1 = {0,1,2,2,3,0,4,2};
        var val = 2;
        var target = 5;
        assertEquals(solution.removeElement(nums1, val), target);
    }


}



