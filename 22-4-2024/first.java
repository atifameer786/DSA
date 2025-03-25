// import java.lang.*;

import java.util.*;

public class first {

    public static void main(String[] args) {


        int binary = 1;
        String str1=String.valueOf(binary);
        String s = "";
        if(2==2){

        }
        else if(){

        }

       
        System.out.println(s.matches("[01]*"));

        String str="programmer@gmail.com";
      //String str="programmer@hotmail.com";
      
      int i=str.indexOf("@");
      String uname=str.substring(0,i);
      String domain=str.substring(i+1, str.length());
      
      System.out.println("Username :"+uname);
      System.out.println("Domain :"+domain);
      
      int j=domain.indexOf(".");
      String name=domain.substring(0, j);
      System.out.println(name.equals("gmail"));

        // String str1 = "prog@tmail.com";

        // int i = str1.indexOf("@");
        // // int j = str1.lastIndexOf(".");
        // int length = str1.length();
        
        
        // String name = str1.substring(0, i);
        // String domain = str1.substring(i+1,length);
        // System.out.println(name);
        // System.out.println(domain);
        // if(domain.matches("gmail.com")){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("FALSE");
        // }
        // String str2 = new String("JAVA");
        // char str3[] = { 'a', 'b', 'c' };

        // System.out.println(str1.matches("[abc]"));
        // if(str1.endsWith("col")){
        //     System.out.println("yes");
        // }
        // else{
        //     System.out.println("No");
        // }
        // System.out.println(str1.startsWith("www"));

        // String str4 = new String(str[1] );

        // Scanner sc = new Scanner(System.in);

        // System.out.println(str1.replace("TU", "AT"));
        

        // System.out.println("enter your age: ");
        // sc.nextLine();

        // System.out.println("My name is atif ");
    }
}