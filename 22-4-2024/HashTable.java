import java.util.*;
import java.util.Map.Entry;

public class HashTable {
    public HashMap<Integer,LinkedList<Integer>> table;
    int size;

    HashTable(int size){
        this.size = size;
        table= new HashMap<>(size);
        for(int i=0;i<size;i++){
            table.put(i, new LinkedList<>());
        }
    }

    public int hash(int key){
        return key%size;
    }
    public void insert(int key) {
        int index = hash(key);
        table.get(index).add(key);
    }

    public  boolean search(int key){
        int index = hash(key);
        return table.get(index).contains(key);
    }
    public void printTable() {
        for (Map.Entry<Integer, LinkedList<Integer>> entry : table.entrySet()) {
            System.out.print("Index " + entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
    }

    public void printTableWithoutEntry() {
        for (int key : table.keySet()) { // Iterate over keys
            System.out.print("Index " + key + ": ");
            System.out.println(table.get(key)); // Access value by key
        }
    }
    

    public static void mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> hp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hp.containsKey(nums[i])){
                hp.put(nums[i],hp.get(nums[i])+1);
            }
            else{
                hp.put(nums[i],1);
            }
        }
        int max =0;
        for(Entry<Integer, Integer> e: hp.entrySet()){
            if(e.getValue()>max){
                max = e.getValue();
            }
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println("Max Frequent: "+max);
    
    }



    public static void main(String[] args) {
        // int size = 10;
        // HashTable ht = new HashTable(size);
        // ht.insert(1);
        // ht.insert(15);
        // ht.insert(5);
        // ht.insert(20);
        // ht.insert(13);
        // ht.insert(9);
        // ht.insert(19);
        
        // ht.search(20);
        // ht.printTable();
        // System.out.println(ht.search(20));
        // // ht.printTableWithoutEntry();
        // System.out.println("table key set: "+ht.table.keySet());
        int[] arr = {1,23,4,5,5,5,2,2,2,2};
        mostFrequentElement(arr);
        // int size = 10;
        
        // HashMap<Integer,LinkedList<Integer>> hm = new HashMap<>(size);
        // for (int i = 0; i < size; i++) {
        //     hm.put(i, new LinkedList<>());
        // }
        
        
     
        // hm.get(10%size).add(10);
        // hm.get(20%size).add(20);
        // hm.get(11%size).add(11);
        // hm.get(18%size).add(18);
        // hm.get(19%size).add(19);
        // hm.get(18%size).add(18);
        // hm.get(15%size).add(15);
        // System.out.println(hm.get(0).getLast());
        // hm.get(15%size).removeFirstOccurrence(15);
        // System.out.println(hm.get(5).contains(15));
        


        

        
    }

    
}
