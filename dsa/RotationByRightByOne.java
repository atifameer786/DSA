public class RotationByRightByOne {

    public static void rightRotation(int[] a){
        int l = a.length;
        int tmp = a[l-1];

        for(int i=l-1;i>0;i--){
            a[i] = a[i-1];
        }
        a[0] = tmp;
    }

    public static void swap(int[] a){


        for(int i=0;i<a.length;i++){
            
            if(a[i]>a[i+1]){
                int tmp = a[i];
                a[i] = a[i+1];
                a[i+1] = tmp;
            }

        }
       
        

    }

    public static void sortArray(int[] a){

        int n = a.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    swap(a);
                }
            }
        }


    }




    public static void main(String[] args) {

        int[] a= {6,5,4,3,2,1};
        int n = a.length;
       

    //    rightRotation(a);
        sortArray(a);

        for(int i=0;i<n;i++){
            System.out.print(a[i]+", ");
        }

        
    }
    
}
