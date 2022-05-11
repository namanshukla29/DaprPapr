public class BubbleSort {
    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {

            boolean swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
    void printArray(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {8, 9, 10, 11, 31, 50, 130};
        ob.bubbleSort(arr);
        System.out.println("Sorted Array");
        ob.printArray(arr);
    }
    }
