package challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BinarySearchTest {
    @Test public void testBinarySearch() {
        BinarySearch test = new BinarySearch();

        int[] testArr1 = new int[]{2, 4, 6, 8, 10};
        int searchKey1 = 8;

        int[] testArr2 = new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10};
        int searchKey2 = 6;

        assertEquals("Success, you've found the key!", test.binarySearch(testArr1, searchKey1), 3);
        assertEquals("No key for you mate", test.binarySearch(testArr2, searchKey2), -1);
    }
}
