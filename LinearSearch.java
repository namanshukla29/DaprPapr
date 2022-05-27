public class LinearSearch {

     public static int search(int[] arr,int x){
        int n = arr.length;
        for (int i=0;i<n;i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,5,2,1};
        int n = arr.length;
         int result = search(arr,5);
        if (result == -1){
            System.out.println("Element is not present in the list");
        }else
            System.out.println("Element is present at index " + result);

    }
}
