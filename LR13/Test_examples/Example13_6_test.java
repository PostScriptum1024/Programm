package Test_examples;

public class Example13_6_test {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("Error");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("3");
        } catch (Exception e) {
            System.out.println("2");
        }
        System.out.println("4");
    }
}
