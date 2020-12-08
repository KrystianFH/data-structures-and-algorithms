package challenges;

public class BinarySearch {
    public int binarySearch (int [] arr, int searchKey){

        int index = -1;
        int low = 0;
        int high = arr.length;
        while (low <= high){
            int mid = (low + high)/2;

            if(arr[mid] < searchKey){
                low = mid + 1;
            }

            else if (arr[mid] > searchKey){
                high = mid - 1;
            }

            else if (arr[mid] == searchKey){
                index = mid;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
}
