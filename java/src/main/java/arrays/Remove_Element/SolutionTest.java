package arrays.Remove_Element;

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
        int[] nums = {
                3,2,2,3
        };
        int[] target  =  {2, 2};
        int val = 3;
        var expected = 2;
        var result = solution.removeElement(nums , val);
        assertArrayEquals( Arrays.copyOfRange(nums, 0, expected), target) ;
        assertEquals(result, expected);

    }
    @Test
    public void Test1() {
        int[] nums = {
                0,1,2,2,3,0,4,2
        };
        int[] target  =  {0,1,4,0,3};
        int val = 2;
        var expected = 5;
        var result = solution.removeElement(nums , val);
        assertArrayEquals( Arrays.copyOfRange(nums, 0, expected), target) ;
        assertEquals(result, expected);

    }

}



