package arrays.Replace_Elements_with_Greatest_Element_on_Right_Side;

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
                17,18,5,4,6,1
        };
        int[] target  =  {18,6,6,6,1,-1};
        assertArrayEquals(solution.replaceElements(nums), target) ;

    }
    @Test
    public void Test1() {
        int[] nums = {
                400
        };
        int[] target  =  {-1};
        assertArrayEquals(solution.replaceElements(nums), target) ;

    }

}



