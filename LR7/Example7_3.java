public class Example7_3 {
    public static void main(String[] args) {
        var obj1 = new Example7_3_Sup_Class(1);
        var obj2 = new Example7_3_FirstSub_Class(2, '&');
        var obj3 = new Example7_3_SecondSub_Class(3, '|', "text");

        Object ref;

        ref = obj1;
        System.out.println(ref.toString());
        obj1.setValues(11);
        System.out.println(ref.toString());

        ref = obj2;
        System.out.println(ref.toString());
        obj2.setValues(22, '^');
        System.out.println(ref.toString());

        ref = obj3;
        System.out.println(ref.toString());
        obj3.setValues(33, '%', "new text");
        System.out.println(ref.toString());
    }
}