public class NegativeOnLeftPostiveOnRight {

    public void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }

    public void swap(int[] A,int a,int b){
        int tmp = A[a];
        A[a] = A[b];
        A[b] = tmp;
    }

    public void solution(int[] A){

        int n = A.length;
        int i=0;
        int j = n-1;
        while(i<j){
            while(A[i]<0){
                i++;
            }
            while(A[j]>0){
                j--;
            }
            if(i<j){
                swap(A, i, j);
            }
        }

    }

    public static void main(String[] args) {

        int[] A = {-1,2,3,-4,8,-9,3,7};

        NegativeOnLeftPostiveOnRight ne = new NegativeOnLeftPostiveOnRight();
        ne.printArray(A);
        ne.solution(A);
        ne.printArray(A);
        
    }
    
}
