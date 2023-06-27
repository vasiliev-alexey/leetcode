package Duplicate_Zeros;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

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
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] target = {1, 0, 0, 2, 3, 0, 0, 4};
        solution.duplicateZeros(nums);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(nums, target);

    }

    @Test
    public void Test1() {
        int[] nums = {1, 2, 3};
        int[] target = {1, 2, 3};
        solution.duplicateZeros(nums);
        assertArrayEquals(nums, target);

    }
    @Test
    public void Test2() {
        int[] nums = {0,0,0,0,0,0,0};
        int[] target = {0,0,0,0,0,0,0};
        solution.duplicateZeros(nums);
        assertArrayEquals(nums, target);

    }    @Test
    public void Test3() {
        int[] nums = {1,5,2,0,6,8,0,6,0};
        int[] target = {1,5,2,0,0,6,8,0,0};
        solution.duplicateZeros(nums);
        assertArrayEquals(nums, target);

    }

}



