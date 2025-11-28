package oops.innerClasses;


class Outer{
    public int x = 10;



    class Inner{
        int y = 5;

        public void innerDisplay(){
            System.out.println("outerVariable: "+x);
            System.out.println("innerVariable: "+y);

        }
    }

    public void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
        System.out.println(x);
    }
}

public class Test {

    public static void main(String[] args) {

        Outer o = new Outer();
        o.outerDisplay();
        
    

   
        
    }

    
    
    
}
