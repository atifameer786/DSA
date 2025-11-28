package oops;


class Vechile{

    private String VechileType;
    private String LicencePlate;
    

}



class ParkingLot{

    private String sloteNumber;
    private String floor;
    private boolean isSloteAvailabel;
    private String vechileType;
  
}



class AllocateSlote{

    Vechile vech = new Vechile();

}

class Singleton{

private static volatile Singleton instance;

private Singleton(){
}

public static synchronized Singleton getInstance(){

if(instance==null){
synchronized (Singleton.class){
if(instance==null){
instance = new Singleton();

return instance;


}


}



public class SingleTone {


    private static SingleTone instance;

    private SingleTone(){

    }

    public static SingleTone getInstance(){

        if(instance==null){
            instance = new SingleTone();
        }
        return instance;
    }



    
}
