class Circle {
    public double r;

    public Circle(double r){
        this.r = r;

    }

    public  double area(){
        return Math.PI*r*r;
    }
    public  double perimeter(){
        return 2*Math.PI*r;
    }

    public  double circumference(){
        return perimeter();
    }
}

class Cylinder extends Circle{

    public Cylinder(double r) {
        super(r);
        //TODO Auto-generated constructor stub
    }



    public double h;
   


    public double volume(){
        return area()*h;
    }
}
    

public class Inheritance  {

    public static void main(String[] args) {

        Cylinder c = new Cylinder();
        c.r = 2;
        c.h = 4;
        System.out.println(c.volume());

      

        
    }
    
}


