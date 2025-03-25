public class MaxOfTwo {

    static int max(int x ,int y){
        if(x>=y){
            return x;
        }
        else{
            return y;
        }
    }


    public static void main(String[] args) {
        int a=5;int b=10;int c;
       c= max(a,b);
       System.out.println(max(5, 1));
    }
    
}
