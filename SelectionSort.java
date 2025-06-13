public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        int n = arr.length;
  // selection sort
       for (int i = 0; i < n-1; i++) {
    int minIndex = i;
    for (int j = i+1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
            minIndex = j;
        }
    }
    // swap arr[i] and arr[minIndex]
    int temp = arr[minIndex];
    arr[minIndex] = arr[i];
    arr[i] = temp;
}


        // Print sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}