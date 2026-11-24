
import java.util.Arrays;

public class SortingAlgorithms {

    // 1. BUBBLE SORT
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    // 2. SELECTION SORT
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

    // 3. INSERTION SORT
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;

            }

            arr[j + 1] = key;

        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        int[] originalArray = {
            45, 12, 78, 3, 56, 23, 89, 10, 34, 67
        };

        // Create separate copies
        int[] bubbleArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] selectionArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] insertionArray = Arrays.copyOf(originalArray, originalArray.length);

        // Display original array
        System.out.println("Original Array: "
                + Arrays.toString(originalArray));

        // Bubble Sort
        bubbleSort(bubbleArray);
        System.out.println("Bubble Sort: "
                + Arrays.toString(bubbleArray));

        // Selection Sort
        selectionSort(selectionArray);
        System.out.println("Selection Sort: "
                + Arrays.toString(selectionArray));

        // Insertion Sort
        insertionSort(insertionArray);
        System.out.println("Insertion Sort: "
                + Arrays.toString(insertionArray));

    }
}
