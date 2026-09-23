import java.util.Arrays;

//ALL QUESTIONS ARE ANSWERED IN THE README FILE, THANK YOU.

public class Main {
    public static void main(String[] args) {
       int[] unsorted = { 22, 1, 4, 8, 34, 9, 99, 32, 34, 58, 86, 55 };
       System.out.println("Original Array:");
       for (int num : unsorted) {
        System.out.print(num + " ");
       }
        System.out.println();

        // Part 3: Bubble Sort 
        int[] bubbleArray = Arrays.copyOf(unsorted, unsorted.length);
        bubbleSort(bubbleArray);

        System.out.println("\nBubble Sort Result:");
        for (int num : bubbleArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Part 5: Merge Sort 
        int[] mergeArray = Arrays.copyOf(unsorted, unsorted.length);
        mergeSort(mergeArray, 0, mergeArray.length - 1);

        System.out.println("\nMerge Sort Result:");
        for (int num : mergeArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Part 7 & 8: Linear Search
        System.out.println("\nLinear Search");

        int target1 = 22; // near the beginning
        int result1 = linearSearch(unsorted, target1);
        System.out.println("Target: " + target1);
        if (result1 != -1) {
            System.out.println("Target found at index " + result1);
        } else {
            System.out.println("Target not found.");
        }

        int target2 = 55; // near the end
        int result2 = linearSearch(unsorted, target2);
        System.out.println("Target: " + target2);
        if (result2 != -1) {
            System.out.println("Target found at index " + result2);
        } else {
            System.out.println("Target not found.");
        }

        int target3 = 500; // does not exist
        int result3 = linearSearch(unsorted, target3);
        System.out.println("Target: " + target3);
        if (result3 != -1) {
            System.out.println("Target found at index " + result3);
        } else {
            System.out.println("Target not found.");
        }

        //Part 9 & 10: Binary Search
        System.out.println("\nBinary Search");

        int target4 = 4; // near the beginning of array
        int result4 = binarySearch(bubbleArray, target4);
        System.out.println("Searching for " + target4);
        if (result4 != -1) {
            System.out.println("Target found at index " + result4);
        } else {
            System.out.println("Target not found.");
        }

        int target5 = 86; // near the end of array
        int result5 = binarySearch(bubbleArray, target5);
        System.out.println("Searching for " + target5);
        if (result5 != -1) {
            System.out.println("Target found at index " + result5);
        } else {
            System.out.println("Target not found.");
        }

        int target6 = 500; // does not exist
        int result6 = binarySearch(bubbleArray, target6);
        System.out.println("Searching for " + target6);
        if (result6 != -1) {
            System.out.println("Target found at index " + result6);
        } else {
            System.out.println("Target not found.");
        }
    }
        
       //bubble sort
         public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
        //Merge sort
        public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(arr, left, middle);       // sort left half
            mergeSort(arr, middle + 1, right);  // sort right half

            merge(arr, left, middle, right);    // merge the two halves
        }
    }   private static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Linear Search 
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    
    //Binary Search 
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;   // ignore left half
            } else {
                high = mid - 1;  // ignore right half
            }
        }
        return -1;
    }


}