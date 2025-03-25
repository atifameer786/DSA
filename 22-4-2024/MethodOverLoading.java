public class MethodOverLoading {

    static int area(int x, int y) {
        int a = x * y;
        return a;
    }

    static double area(double r) {
        double a = Math.PI * r * r;
        return a;
    }

    static void show(int... x) {
        for(int a:x){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        // show(1,2,3,4,5);
        double s=0;
        for(String x:args)
        {
            if(x.matches("[0-9\\.]+"))
                s=s+Double.parseDouble(x);
        }
        System.out.println("Sum is "+s);
    

    }

}
