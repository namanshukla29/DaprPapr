public class QuickSort {


    public static int partition(int[]arr,int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j=low;j<high;j++){   // j will go till high-1    // or j<=high-1
            if (arr[j] < pivot){
                i++;      // makes space for element
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];    // arr[high] = pivot
        arr[high] = temp;
        return i;   // pivot index

    }

    public static void quickSort(int[] arr,int low,int high){
        if (low < high){
            int pidx = partition(arr, low, high);   // end element as pivot, smaller in left of pivot and larger on right

            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);
        }

    }

    public static void main(String[] args) {
        //int[] arr = {6,3,9,5,2,8};
        int[] arr = {3,4,2,1,6,5,7,8,1,1};
        int n = arr.length;

        quickSort(arr,0,n-1);

        // print
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
            System.out.println();
        }
    }
}
