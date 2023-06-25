package Squares_of_a_Sorted_Array;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static junit.framework.TestCase.assertEquals;
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
                -4,-1,0,3,10
        };
        int[] target  =  {0,1,9,16,100};
        assertArrayEquals(solution.sortedSquares(nums), target) ;

    }
    @Test
    public void Test2() {
        int[] nums = {
                -7,-3,2,3,11
        };
        int[] target  =  {4,9,9,49,121};
        assertArrayEquals(solution.sortedSquares(nums), target) ;

    }
}



