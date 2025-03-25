class Parent {

    int length;
    int breadth;

    public Parent(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
        System.out.println("Parent 2-param constructor: ");
    }

    public Parent() {
        System.out.println("Prarent not-param constructor: ");
    }

}

class Child extends Parent {

    public Child(int y){
        System.out.println("child Param constructor: ");
    }

    public Child() {
        System.out.println("child non-param constructor: ");
    }
}
class GrandChild extends Child {

    public GrandChild(int z){

        System.out.println("GrandChild Param Constructor ");
        
    }

    public GrandChild(){

        System.out.println("GrandChild non-param Constructor ");
        
    }

    
    
}

public class Constructor {

    public static void main(String[] args) {

        // Child c = new Child(3);
        // Parent p = new Parent();
        GrandChild g = new GrandChild(2);

    }

}
