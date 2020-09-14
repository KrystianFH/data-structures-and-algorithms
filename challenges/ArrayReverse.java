// import java.util.*;
// Below code structure referenced from https://www.geeksforgeeks.org/reverse-an-array-in-java/

public class ArrayReverse {

  static void reverseArray(int a[], int n){
    int[] b = new int[n];
    int j = n;
    for (int i = 0; i < n; i++){
      b[j - 1] = a[i];
      j = j - 1;
    }

    System.out.println ("Reversed array is: \n");
    for (int k = 0; k < n; k++){
      System.out.println(b[k]);
    }
  }
  public static void main (String[] args)
  {
    int [] arr = {10, 20, 30, 40, 50};
    reverseArray (arr, arr.length);
  }
}


// Below Code is reference from https://www.softwaretestinghelp.com/reverse-an-array-in-java/ and requires the import

// public class ArrayReverse{

//   static void reverse (Integer myArray[])
//   {
//     Collections.reverse(Arrays.asList(myArray));
//     System.out.println("Reversed Array:" + Arrays.asList(myArray));
//   }

//   public static void main(String [] args)
//   {
//     Integer [] myArray = {1, 2, 3, 4, 5, 6};
//     System.out.println("Original Array:" + Arrays.asList(myArray));
//     reverse(myArray);
//   }

// }