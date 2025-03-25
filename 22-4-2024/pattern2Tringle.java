public class pattern2Tringle {

    public static void solve(int n){
        for (int i = n; i >0; i--)
    {
        for (int j=i; j>0; j--)
        {
            System.out.print("*");
        }
       System.out.println();
    }
    
    }


    public static void main(String[] args) {
        solve(5);
    }
    
}
