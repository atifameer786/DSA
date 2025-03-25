public class InsertElementInAnArray {


    public void insert(int[] arr,int index,int key){
        for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index] = key;
    }

    public static void main(String[] args) {
        InsertElementInAnArray ie = new InsertElementInAnArray();
        int[] arr1 = {1,2,3,4,5};
        int key = 15;
        int index = 0;
        ie.insert(arr1, index, key);

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+", ");
        }
        System.out.println();
        
        
    }
    
}
