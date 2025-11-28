package oops.interfaces;

class Phone {

    void call(){

    }
    void sms(){

    }
    
}

interface Camera{

    void click();
    void record();

}

interface MusicPlayer{
    void play();
    void pause();
    void stop();

}

class Smartphone extends Phone implements MusicPlayer ,Camera{

    public void vidio(){
        System.out.println("Vidio");
    }

    public void click(){
        System.out.println("click a picture");
    }
    public void record(){
        System.out.println("recorede vidio");
    }
     public void play(){
        System.out.println("play");
     }
    public void pause(){
        System.out.println("pause");
    }
    public void stop(){
        System.out.println("stop");
    }
    public void abc(){
        System.out.println("abc");
    }



} 

public class InterfacePractice {


    public static void main(String args[]){

        Smartphone s = new Smartphone();
        Phone p = s;
        Camera c = s;
        MusicPlayer m = s;


    }
    
}
