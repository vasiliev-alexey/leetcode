package Move_Zeroes;

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
                0,1,0,3,12
        };
        int[] target = {1,3,12,0,0};
        solution.moveZeroes(nums);
        assertArrayEquals(nums, target);
        ;

    }
    @Test
    public void Test1() {
        int[] nums = {
                0
        };
        int[] target = {0};
        solution.moveZeroes(nums);
        assertArrayEquals(nums, target);
        ;

    }



}



