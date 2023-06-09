package arrays.Max_Consecutive_Ones;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static junit.framework.TestCase.assertEquals;

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
                1, 1, 0, 1, 1, 1
        };
        int target = 3;
        assertEquals(solution.findMaxConsecutiveOnes(nums), target) ;

    }
    @Test
    public void Test2() {
        int[] nums = {
                 1,0,1,1,0,1
        };
        int target = 2;
        assertEquals(solution.findMaxConsecutiveOnes(nums), target) ;

    }
}



