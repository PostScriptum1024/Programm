package Test_examples;

public class Example13_7_test {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("Error");
        } catch (NullPointerException e) {
            System.out.println("1");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        System.out.println("3");
    }
}
