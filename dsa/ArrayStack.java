import java.util.Stack;

public class ArrayStack {


    static int size;
    static int top;
    static int[] stack;

    public ArrayStack() {
        size = 1000;
        stack = new int[size];
        top = -1;
        
    }

    public static void push(int x) {
        // if (top >=size -1){
        //     System.out.println("Stack overflow");
        //     return ;
        // }
        stack[++top] = x;

       
    }

    public int pop() {
        // if(top<0){
        //     System.out.println("Stack underflow");
        // }
        int x = stack[top--];
        return x;
      
    }

    public int top() {

        // if(top<0){
        //     System.out.println("Stack underflow");
        // }
        return stack[top];
        
    }

    public boolean isEmpty() {
        
        return top ==-1;
        
    }

    public static boolean isValid(String s){

        Stack<Character> stack = new Stack<>(); 

        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                int top = stack.pop();
                if(ch=='}' && top !='{' || ch==']' && top !='[' ||ch==')' && top !='('){
                    return false;
                }
            }
        }

        return stack.isEmpty();

        
    }


    static boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        int size = s.length();
        for(int i=0;i<size;i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else{
                char top = st.pop();
                if(s.charAt(i)=='}' && top !='{' || s.charAt(i)==']' && top !='[' || s.charAt(i)==')' && top !='('){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static String reverseStringUsingStack(String S) {
        
        Stack<Character> st = new Stack<>();
        String rev = "";
        int size = S.length();
        for(int i=0;i<size;i++){
            st.push(S.charAt(i));
        }

        while(!st.isEmpty()){
            char c = st.pop();
            rev +=c;
        }

        return rev;
        
    }
 
    public static void main(String[] args) {

       
       Stack st = new Stack();
    //    st.size = 10;
       st.push(1);
       st.push(4);

       String s = "abcdef";
    //    System.out.println(st.top());
    //    System.out.println(st.pop());
    //    System.out.println(st.isEmpty());
    //    System.out.println(st.top());

    // System.out.println(isValid(s));
    System.out.println(reverseStringUsingStack(s));
        
        
        
    }

    
}
