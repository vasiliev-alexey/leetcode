package array_and_string.Diagonal_Traverse;

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
        int[][] nums = { {1, 2, 3},{4, 5, 6},{7, 8, 9}  };
        int[] target = {1,2,4,7,5,3,6,8,9};
        assertArrayEquals(target, solution.findDiagonalOrder(nums));
    }
    @Test
    public void Test1() {
        int[][] nums = { {1, 2} ,{3,4} };
        int[] target = {1,2,3,4};
        assertArrayEquals(target, solution.findDiagonalOrder(nums));
    }



}



