public class Example6_4 {
    public static void main(String[] args) {
        System.out.println(doubleFactorial(1));
        System.out.println(doubleFactorial(10));
    }

    public static int doubleFactorial (int n) {

        if (n == 0 || n == 1){
            return 1;
        }

        return n * doubleFactorial(n - 2);
    }
}
