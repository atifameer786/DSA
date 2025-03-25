class Atif{

    public int channel;
    public int volume;

    public void changeChannel(int c){

        System.out.println("Channel Changed.. "+c);

    }
    public void changeVolume(int v){
        System.out.println("Volume Changed.. "+v);

    }

}
public class Test {



    public static void main(String[] args) {
        // Oops o = new Oops();
        Atif a = new Atif();
        a.changeChannel(5);
        a.changeVolume(10);
    }
    
}
