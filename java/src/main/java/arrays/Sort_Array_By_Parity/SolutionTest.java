package arrays.Sort_Array_By_Parity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertArrayEquals;

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
                3,1,2,4
        };
        int[] target  =  {2,4,3,1};
        assertArrayEquals(solution.sortArrayByParity(nums), target) ;

    }
    @Test
    public void Test2() {
        int[] nums = {
                0
        };
        int[] target  =  {0};
        assertArrayEquals(solution.sortArrayByParity(nums), target) ;

    }
}



