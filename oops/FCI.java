package oops;

import java.util.Arrays;

public class FCI {

    public static int[] nextGreterElement(int[] arr){
    int size = arr.length;
    int[] result = new int[size];

    for(int i = size-1;i>=0;i--){
        result[i] = -1;
        for(int j =i;j>=0;j--){
            if(arr[i]<arr[j]){
                result[i] = arr[j];
                break;
            }
        }
        
    }
    return result;

    }
    // output {-1,12,-1,15,-1,20,20}

    arr[][]= {{1,2,3,}, {4,5,6}, {7,8,9}};

    public int[] printElement(int[][] arr){

                                        


    }

    


    public static void main(String[] args) {
        int[] arr = {12,6,15,7,20,1,5};

        int[] ans = nextGreterElement(arr);

        System.out.println(Arrays.toString(ans));

        
        
    }
    
}
