package Independent_examples; public class Example9_1_Recursion_4 {

    public static int factorial(int x) {
        if (x == 1)
            return 1;
        else
            return factorial(x - 1) * x;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
