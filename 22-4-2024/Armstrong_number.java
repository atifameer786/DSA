public class Armstrong_number {

    public static void solution(int num){
        int var = num;
        int ams =0;
        while (var!=0){
            int r = var%10;
            int p = r*r*r;
            ams = ams +p;
            var = var/10;
        }

        if(num == ams){
            System.out.println("Number is armstrong: ");
        }
        else{
            System.out.println("Number is not armstrong: ");
        }

    }

    public static void main(String[] args) {
        int x = 9119;
       solution(x);
    }
    
}
