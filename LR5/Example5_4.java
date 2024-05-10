public class Example5_4 {
    public static void main(String[] args) {

        Example5_4_class obj = new Example5_4_class(13, '%');
        System.out.printf("num = %s, symbol = %s (The object was created using int and char)\n", obj.get_num(), obj.get_symbol());
        obj = null;

        Example5_4_class objTwo = new Example5_4_class(5.3356);
        System.out.printf("num = %s, symbol = %s (The object was created using double)\n", objTwo.get_num(), objTwo.get_symbol());
        objTwo = null;
    }
}
