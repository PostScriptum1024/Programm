package Independent_examples; public class Example9_1_Recursion_1 {

    public static void recursion(int x) {
        System.out.println("x= " + x);
        if ((2 * x + 1) < 20)
            recursion(2 * x + 1);
    }
    public static void main(String[] args) {
        recursion(1);
    }
}
