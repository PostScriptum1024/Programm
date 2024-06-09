package Test_examples;

public class Example13_2_test {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("An unverifiable error");
            //System.out.println("1"); // Ошибка компиляции
        } catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }
}
