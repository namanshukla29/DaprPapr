public class BinarySearch {

     int  binarySearch (int[] arr,int key){
         int n = arr.length;
         int start = 0;
         int  end = n-1;
        int mid = start + (end - start)/2;
        while (start <= end){
            if (arr[mid] == key){
                return mid;
            }
            if (key > arr[mid]){
                 // go to right part of  the array
                start = mid + 1;
            }
            else  // left side of the array(key < arr[mid])
                end = mid - 1;

            mid = start + (end - start)/2;
        }
       return -1;
    }

    void printArray(int[] arr){
        int n = arr.length;
        for (int j : arr) {
            System.out.println(j + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] arr = {2,4,6,8,10,12};
        int n = arr.length;
        //int start = 0;
        //int end = n - 1;
        int key = 10;
       // int[] arr = {2,4,6,8,10,12};
       int result = ob.binarySearch(arr,key);
       if (result == -1)
           System.out.println("Number does not exist");
       else
           System.out.println("Element found at index " + result);


    }
}
