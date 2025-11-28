package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Calculator {

    // int opration(int a,int b);
    // void display();
    boolean isPrime(int x);
}

public class Celerispay {

    public String maxWord(String[] str){

    Map<String,Integer> mp = new HashMap<>();

    for(String s: str){
        mp.put(s,mp.getOrDefault(s,0)+1);
    }

    int maxCount = 0;
    for(Integer count:mp.values()){
        if(count>maxCount){
            maxCount=count;
        }
    }

    List<String> al = new ArrayList<>();
    for(Map.Entry<String,Integer> e :mp.entrySet()){
        if(maxCount==e.getValue()){
            al.add(e.getKey());
        }
    }

    Collections.sort(al);

    System.out.println(al.get(0));
    return al.get(0);
}




    public static void main(String[] args) {

        String[] str = {"atif","atif","atif","tazeem","tazeem","saood","qasim","qasim","qasim"};
        Celerispay c = new Celerispay();
        c.maxWord(str);

        // Calculator cal = (a,b)->a+b;
        // System.out.println(cal.opration(5, 6));
        // Calculator cal = ()->{System.out.println("Hello World!");};
        Calculator cal = (x)->{
            if (x <= 1) return false;
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) return false;
            }
            return true;
        };
        System.out.println(cal.isPrime(7));

    }
    
}
