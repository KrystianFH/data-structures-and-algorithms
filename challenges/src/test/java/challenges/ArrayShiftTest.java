package challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void testShiftArray(){

        ArrayShift test = new ArrayShift();

        int[] inputArray1 = new int[]{2, 4, 6, 8};
        int val1 = 5;

        int[] inputArray2 = new int[]{4, 8, 15, 23, 42};
        int val2 = 16;

        int[] newNumbersArray1 = test.insertShiftArray(inputArray1, val1);
        assertEquals(newNumbersArray1[2], val1);

        int[] newNumbersArray2 = test.insertShiftArray(inputArray2, val2);
        assertEquals(newNumbersArray2[3], val2);
    }
}
