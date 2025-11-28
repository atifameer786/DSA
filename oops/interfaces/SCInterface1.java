package oops.interfaces;



public class SCInterface1{

    public static void main(String[] args) {
        
        Store s  = new Store();
        s.ragister(new Customer(": atif"));
        s.ragister(new VipCustomer());

        s.inviteSale();
    }
}


class Store {

    Member mem[] = new Member[100];
    int count=0;

    void ragister(Member m){
        mem[count++]= m;
    }

    void inviteSale(){
        for(int i=0;i<count;i++){
            mem[i].callBack();
        }
    }
    
}


class Customer implements Member {

    public String name;

    Customer(String name){
        this.name = name;
    }

    public void callBack(){
        System.out.println("OK,I will check"+name);
    }
}

class VipCustomer implements Member{

    public void callBack(){
        System.out.println("VIPs will definetly attend");
    }
}

interface Member {
    
    void callBack();
}
