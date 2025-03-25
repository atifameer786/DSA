import java.util.Arrays;

public class LeftAndRightRotationOfArray {


    public static int[] leftRotation(int a[],int size){
        int tmp = a[0];
        for(int i=1;i<size;i++){
            a[i-1] = a[i];
        }
        a[size-1]= tmp;


        return a;
    }

    public static int[] rightRotation(int a[],int size){
        int tmp = a[size-1];

        for(int i =size-1;i>0;i--){
            
            a[i]= a[i-1];
            
        }
        
        a[0] = tmp;
        return a;
    }

    public static void main(String[] args) {
    int[] a = {1,2,3,4,5,6};

    int size = a.length;
    int[] b = Arrays.copyOf(a, size);
    
    System.out.println("size: "+size);
    int[] leftRotationArray =  leftRotation(a, size);
    int [] rightRotationArray = rightRotation(b, size);
    // System.out.println(Arrays.toString(leftRotationArray));
    // System.out.println(Arrays.toString(rightRotationArray));


    System.out.println("Left Rotation: " + Arrays.toString(leftRotation(a, size)));
    System.out.println("Right Rotation: " + Arrays.toString(rightRotation(b, size)));
        
    }
    
}
