public class LastCorrectorFromString {



    public static void main(String[] args) {
        // String s = "atifjdkfjF";
        // char c = s.charAt(s.length()-1);
        // // char c1 = Character.toLowerCase(c); 
        // System.out.println(c);
        int n = 5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            
        }

        // for(int i=0;i<n;i++){
        //     for(int j =0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=0;i<n;i++){
        //     for(int j =0;j<n-1-i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // for(int i=0;i<n;i++){

        //     for(int j=0;j<n-i-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<2*i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
            
        // }


        // for(int i=0;i<n;i++){

        //     for(int j=0;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<2*n-(2*i+1);j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
    
}
