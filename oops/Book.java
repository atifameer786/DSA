package oops;

import java.util.List;

public class Book {

    public List<String> title ;
    public List<String> author;
    private List<Boolean> isAvailable;


    Book(List<String> title,List<String> author,List<Boolean> isAvailable){
        this.title  =title;
        this.author = author;
        this.isAvailable = isAvailable;
    }


    public String borrowBook(String bookName){

        if(bookName){

        }

    }

    public String  returnBook(String bookName){

    }

    public String getAvailability(String bookName){
        
    }
    
}
