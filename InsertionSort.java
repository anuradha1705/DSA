public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        int n = arr.length;
  // insertion sort
      
  
  for (int i = 1; i < n; i++) {
    int key = arr[i];
    int j = i - 1;
    while (j >= 0 && arr[j] > key) {
        arr[j+1] = arr[j];
        j--;
    }
    arr[j+1] = key;
}



        // Print sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}