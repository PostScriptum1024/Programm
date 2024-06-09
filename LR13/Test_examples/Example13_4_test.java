package Test_examples;

public class Example13_4_test {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Error");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
        } catch (Error e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}
