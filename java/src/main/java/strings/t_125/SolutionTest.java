package strings.t_125;

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
    private  Solution solution;

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
       assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
       assertFalse(solution.isPalindrome("race a car"));
        assertTrue(solution.isPalindrome(" "));
    }


}



