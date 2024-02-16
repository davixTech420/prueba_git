public class hellogit2 {
 

    public static void main(String[] args) {
        System.out.println("hello world this first proved in lenguage java"
                + "\n" + sum(5, 6) + "\n" + res(5, 6) + "\n" + mul(5, 6));
    }
    
    public static int sum(int a, int b) {
        return a + b;
    }
    
    public static int res(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

}