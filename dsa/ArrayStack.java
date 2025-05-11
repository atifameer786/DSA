import java.util.Arrays;
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
        // System.out.println("Stack overflow");
        // return ;
        // }
        stack[++top] = x;

    }

    public int pop() {
        // if(top<0){
        // System.out.println("Stack underflow");
        // }
        int x = stack[top--];
        return x;

    }

    public int top() {

        // if(top<0){
        // System.out.println("Stack underflow");
        // }
        return stack[top];

    }

    public boolean isEmpty() {

        return top == -1;

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                int top = stack.pop();
                if (ch == '}' && top != '{' || ch == ']' && top != '[' || ch == ')' && top != '(') {
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
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                char top = st.pop();
                if (s.charAt(i) == '}' && top != '{' || s.charAt(i) == ']' && top != '['
                        || s.charAt(i) == ')' && top != '(') {
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
        for (int i = 0; i < size; i++) {
            st.push(S.charAt(i));
        }

        while (!st.isEmpty()) {
            char c = st.pop();
            rev += c;
        }

        return rev;

    }

    public static int[] nextLargerElement(int[] arr) {
        int size = arr.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = -1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }
        return result;
    }


    // This problem use array in circular fashaion 
    public static int[] nextLargerElement2(int[] arr) {
        int size = arr.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = -1;
            for (int j = 1; j < size; j++) {
                int index = (j+i)%size;
                if (arr[index] > arr[i]) {
                    result[i] = arr[index];
                    break;
                }
            }
        }
        return result;
    }

    public static int[] nextLargerElementOptimal(int[] arr) {

        // When we try to optimise this problem we use monotonic stack if the stack is empty then push the curent element from array into stack
        // and we need to add -1 to the result and if we find greater elemtent in stack from the curent element 
        // then we pop all the elements which are smaller in stack

        int size = arr.length;
        int[] result = new int[size];
        Stack<Integer> st = new Stack<>();

        for (int i = size - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        return result;

    }


    public static int[] nextLargerElementOptimalCirculaArray(int[] arr) {

        // When we try to optimise this problem we use monotonic stack if the stack is empty then push the curent element from array into stack
        // and we need to add -1 to the result and if we find greater elemtent in stack from the curent element 
        // then we pop all the elements which are smaller in stack
        int size = arr.length;
        int[] result = new int[size];
        Stack<Integer> st = new Stack<>();

        for (int i = 2*size-1; i>=0; i--) {
            int index = i%size;
            while(!st.isEmpty() && st.peek()<= arr[index]){
                st.pop();
            }

            if(i<size){
                result[i]=st.isEmpty()? -1 :st.peek();
            }
            st.push(arr[index]);
        }
        return result;

    }

    public static void main(String[] args) {

        Stack st = new Stack();
        // st.size = 10;
        st.push(1);
        st.push(4);

        String s = "abcdef";
        int[] arr = { 1, 3, 2, 4 };
        int[] result = nextLargerElementOptimal(arr);
        System.out.println((Arrays.toString(result)));
        // System.out.println(st.top());
        // System.out.println(st.pop());
        // System.out.println(st.isEmpty());
        // System.out.println(st.top());

        // System.out.println(isValid(s));
        // System.out.println(reverseStringUsingStack(s));

    }

}
