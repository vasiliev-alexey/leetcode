package arrays.Find_All_Numbers_Disappeared_in_an_Array;

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
                1, 1, 4, 2, 1, 3
        };
        int[] expect = {5 ,6};
        var result = solution.findDisappearedNumbers(nums);
        assertArrayEquals(expect , result.stream().mapToInt(i->i).toArray() );
    }



}



