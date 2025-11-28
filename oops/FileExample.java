package oops;

import java.io.*;

public class FileExample {


    public static void main(String[] args) throws Exception
    {
        
        FileInputStream fis1=new FileInputStream("oops/source1.txt");
        FileInputStream fis2=new FileInputStream("oops/source2.txt");
        FileOutputStream fos=new FileOutputStream("destination.txt");
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        
        
        int b;
        while((b=sis.read())!=-1)
        {
            
            fos.write(b);
        }
        
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
        
    }   
    
}
