import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testReverseBitsCase1() {
        Solution solution = new Solution();

        int input1 = 1;
        int expected1 = Integer.MIN_VALUE;
        int actual1 = solution.reverseBits(input1);
        assertEquals(expected1, actual1);

        int input2 = 5;
        int expected2 = -1610612736;
        int actual2 = solution.reverseBits(input2);
        assertEquals(expected2, actual2);

        int input3 = 255;
        int expected3 = -16777216;
        int actual3 = solution.reverseBits(input3);
        assertEquals(expected3, actual3);

        int input4 = 1023;
        int expected4 = -4194304;
        int actual4 = solution.reverseBits(input4);
        assertEquals(expected4, actual4);

        int input5 = -1;
        int expected5 = -1;
        int actual5 = solution.reverseBits(input5);
        assertEquals(expected5, actual5);

        int input6 = 0;
        int expected6 = 0;
        int actual6 = solution.reverseBits(input6);
        assertEquals(expected6, actual6);

        int input7 = Integer.MAX_VALUE;
        int expected7 = -2;
        int actual7 = solution.reverseBits(input7);
        assertEquals(expected7, actual7);

        int input8 = Integer.MIN_VALUE;
        int expected8 = 1;
        int actual8 = solution.reverseBits(input8);
        assertEquals(expected8, actual8);

        int input9 = -2147483648;
        int expected9 = 1;
        int actual9 = solution.reverseBits(input9);
        assertEquals(expected9, actual9);

        int input10 = 715827882;
        int expected10 = 1431655764;
        int actual10 = solution.reverseBits(input10);
        assertEquals(expected10, actual10);


        System.out.println("All test cases passed.");
    }
}
