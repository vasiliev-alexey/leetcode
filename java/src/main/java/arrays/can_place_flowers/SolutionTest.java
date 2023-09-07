package arrays.can_place_flowers;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

import static org.junit.Assert.*;

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
        int[] nums = new int[]{1, 0, 0, 0, 0, 0};
        assertTrue(solution.canPlaceFlowers(nums , 1));
    }
    @Test
    public void Test2() {
        int[] nums = new int[]{1,0,0,0,1};
        assertFalse(solution.canPlaceFlowers(nums , 2));
    }
    @Test
    public void Test3() {
        int[] nums = new int[]{0,0,0,0,0,1,0,0};
        assertTrue(solution.canPlaceFlowers(nums , 2));
    }



}



