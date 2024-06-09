package Test_examples;

public class Example13_5_test {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Error");
        } catch (NullPointerException e) {
            System.out.println("1");
        }
        System.out.println("2");
    }
}
