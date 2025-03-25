public class secondLargestElement {

    public static int secondLargestE(int[] a, int n){
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    if(n<2){
        return -1;
    }

    for(int i=0;i<n;i++){
        if(a[i]>largest){
            secondLargest = largest;
            largest = a[i];
        }
        else if (secondLargest>a[i]  && secondLargest !=largest){
            secondLargest = a[i];

        }
    }

    if(secondLargest == Integer.MIN_VALUE){
        return -1;
    }
    else{
        return secondLargest;
    }
    }





    public static void main(String[] args) {

        int[] a =  {9,8,3,5,10,11,45};
        int n = a.length;
        int result = secondLargestE(a, n);
        System.out.println(result);
        
    }
    
}
