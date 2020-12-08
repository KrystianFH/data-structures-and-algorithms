package challenges;

import java.util.Arrays;

public class ArrayShift {

        public int[] insertShiftArray(int[] arr, int val) {

            int[] newNumbersArray = new int[arr.length + 1];
            int middleIndex;
            int j = 0;

            if(arr.length % 2 == 0){
                middleIndex = arr.length / 2;
            } else {
                middleIndex = arr.length / 2 + 1;
            }

            for (int i = 0; i < newNumbersArray.length; i++){
                if (newNumbersArray[middleIndex] == newNumbersArray[i]){
                    newNumbersArray[middleIndex] = val;
                } else {
                    newNumbersArray[i] = arr[j];
                    j++;
                }
            }
            return newNumbersArray;
        }}





