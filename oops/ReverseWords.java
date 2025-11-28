package oops;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Atif is name My";
        String[] words = str.split(" "); 

        int i = 0;
        int j = words.length - 1;

        while (i < j) {
           
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;

            i++;
            j--;
        }
        String result = String.join(" ", words);
        System.out.println(result);
    }
}
