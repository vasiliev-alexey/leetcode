package t_3253_Merge_Sorted_Array;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

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
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] target = {1, 2, 2, 3, 5, 6};
        int n = 3;
        int m = 3;
        solution.merge(nums1, n, nums2, m);
        assertArrayEquals(nums1, target);
    }

    @Test
    public void Test1() {
        int[] nums1 = {1};
        int[] nums2 = {};
        int[] target = {1};
        int n = 1;
        int m = 0;
        solution.merge(nums1, n, nums2, m);
        assertArrayEquals(nums1, target);
    }
    @Test
    public void Test2() {
        int[] nums1 = {};
        int[] nums2 = {1};
        int[] target = {1};
        int n = 0;
        int m = 1;
        solution.merge(nums1, n, nums2, m);
        assertArrayEquals(nums1, target);
    }
}



