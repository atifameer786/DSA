public class BinarySearch {

    public int recursiveBinarySearch(int[] arr,int l,int h,int key){

        if(l<h){
            int mid = (l+h)/2;
            if(key==arr[mid]){
                return mid;
            }
            else if(key<arr[mid]){
              return recursiveBinarySearch(arr, l,mid-1, key);
            }
            else{
              return recursiveBinarySearch(arr, mid+1, h, key);
            }

        }
        return -1;
        
        
        
    }

    public int binarySearch(int[] arr, int key) {

        int size = arr.length;
        int l = 0;
        int h = size - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == key) {
                return mid;
            }

            else if (key > arr[mid]) {
                l = mid + 1;
            } else {
                h = mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        int[] arr = { 3, 5, 7, 8, 9, 10, 19, 23, 45, 56, 67, 78, 89, 90 };
        int size = arr.length-1;
        
        System.out.println(bs.recursiveBinarySearch(arr, 0, size, 45));
        System.out.println(bs.binarySearch(arr, 45));
        System.out.println(arr[bs.binarySearch(arr, 45)]);

    }

}
