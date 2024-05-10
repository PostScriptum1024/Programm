public class Example5_5 {
    public static void main(String[] args) {

        Example5_5_class objOne = new Example5_5_class(10);
        System.out.printf("The value is set via the constructor (num = %S)\n", objOne.getNum());
        objOne = null;

        Example5_5_class objTwo = new Example5_5_class();
        objTwo.setNum();
        System.out.printf("The value is set via an empty setter (num = %S)\n", objTwo.getNum());
        objTwo = null;

        Example5_5_class objThree = new Example5_5_class();
        int value = 1000;
        objThree.setNum(value);
        System.out.printf("The value (%s) is set with verification (num = %S)\n", value, objThree.getNum());
        objThree = null;
    }
}
