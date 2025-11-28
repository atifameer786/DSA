

class Car{

    public static void print(){
        System.out.println("call from Car");
    }


}


class Bus extends Car {

    public static void print(){
        System.out.println("Call from Bus");
    }


    
}




public class Employee {

    public static String reverseWord(String str){
        String[] words = str.split(" ");
        int i = 0;
        int j = words.length-1;

        while(i<j){
            String tmp = words[i];
            words[i]=words[j];
            words[j]=tmp;
            i++;
            j--;
        }
        String reverse = String.join(" ", words);
        return reverse;
    }


    public static void main(String[] args) {
        
    
        Car c = new Bus();
       
        c.print();

    }
    
}
