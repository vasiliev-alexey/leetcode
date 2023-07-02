package arrays.Remove_Duplicates_from_Sorted_Array;

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
                1, 1, 2
        };
        int target = 2;
        assertEquals(solution.removeDuplicates(nums), target);
        ;

    }

    @Test
    public void Test1() {
        int[] nums = {
                0, 0, 1, 1, 1, 2, 2, 3, 3, 4
        };
        int target = 5;
        assertEquals(solution.removeDuplicates(nums), target);
        ;

    }

}



