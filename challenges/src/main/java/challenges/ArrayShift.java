package challenges;

import java.util.Arrays;

public class ArrayShift {

        public int[] insertShiftArray(int[] arr, int val) {
            int[] numbers = new int[]{2, 4, 6, 8};
            int newNumb = 5;
            int[] newNumbers = new int[numbers.length + 1];
            for (int i = newNumbers.length - 1; i > 0; i++) {
                if (newNumbers[i] == 0) continue;
//                numbers[i + 1] = numbers[i];
                if (newNumbers[i] <= val) {
                    arr[i] = val;
                    break;
                }
//            int[] objArr = add(numbers, newNumb);

                System.out.println(Arrays.toString(newNumbers));
                return newNumbers;
            }
            return newNumbers;
        }}





