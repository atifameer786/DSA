

public class MinMaxElimentArray {

   

    public static void main(String[] args) {

        int[] a = {9,8,3,4,56,2,7};

        int max =a[0];
        int min = a[0];
        
    
        for (int i=1;i<a.length;i++){

            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
    
        }

        System.out.println("Max is :"+max +" Min is: "+min);
        
    }
    
}
