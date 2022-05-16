public class InsertionSort {

    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {

            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
    void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0;i<n;i++){
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InsertionSort ob = new InsertionSort();
        int[] arr = {12,11,13,5,6};
        ob.sort(arr);
        System.out.println("Sorted Array");
        ob.printArray(arr);

    }
}
