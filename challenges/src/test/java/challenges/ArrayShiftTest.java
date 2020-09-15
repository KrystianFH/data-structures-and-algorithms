package challenges;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class ArrayShiftTest {

    @Test
    public void testInsertShiftArray() {
        ArrayShift classUnderTest = new ArrayShift();
        int[] inputArray1 = new int[]{2, 4, 6, 8};
        int[] outputArray1 = classUnderTest.insertShiftArray(inputArray1, 5);
        int[] expectedOutcome = {2, 4, 5, 6, 8};

        assertArrayEquals(expectedOutcome, outputArray1);
    }
}
