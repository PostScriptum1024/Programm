package Test_examples;

public class Example13_1_test  {
public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("An unverifiable error");
        } catch (RuntimeException e) {
            System.out.println("1 " + e);
        }
        System.out.println("2");
    }
}