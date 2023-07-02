package arrays.Find_Numbers_with_Even_Number_of_Digits;

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
                12,345,2,6,7896
        };
        int target = 2;
        assertEquals(solution.findNumbers(nums), target) ;

    }
    @Test
    public void Test2() {
        int[] nums = {
                555,901,482,1771
        };
        int target = 1;
        assertEquals(solution.findNumbers(nums), target) ;

    }
}



