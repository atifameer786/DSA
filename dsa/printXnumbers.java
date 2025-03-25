class PrintXnumbers {
    public void printX(int X, int N) {

        for(int i=0;i<N; i++){
            System.out.print(X+" ");   
        }
        System.out.println();

    }

    public static void main(String[] args) {
        PrintXnumbers pm = new PrintXnumbers();
        pm.printX(7, 5);
    }
}