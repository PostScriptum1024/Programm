public class Example5_3 {
    public static void main(String[] args) {

        Example5_3_class exOne = new Example5_3_class();
        System.out.printf("firstValue = %s, secondValue = %s (The object was created without arguments)\n", Example5_3_class.first_value, Example5_3_class.second_value);

        Example5_3_class exTwo = new Example5_3_class(1);
        System.out.printf("firstValue = %s, secondValue = %s (The object was created with a single argument)\n", Example5_3_class.first_value, Example5_3_class.second_value);
        exTwo = null;

        Example5_3_class exThree = new Example5_3_class(1, 2);
        System.out.printf("firstValue = %s, secondValue = %s (The object was created with two arguments)", Example5_3_class.first_value, Example5_3_class.second_value);
        exThree = null;
    }
}
