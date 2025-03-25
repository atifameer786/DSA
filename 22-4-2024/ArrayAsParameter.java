public class ArrayAsParameter {

    static void update(int A[]) {
        A[0] = 25;

    }

    static String name(String email){
        int a = email.indexOf('@');
        String name = email.substring(0, a);
        return name;
    }

    public static void main(String[] args) {
        String s = "Atifameer@gmail.com";
        // name(s);
        System.out.println(name(s));
        int A[] = { 1, 2, 3, 4, 5 };
        System.out.println(A[0]);
        update(A);
        System.out.println(A[0]);
    }

}
