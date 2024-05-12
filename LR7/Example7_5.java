public class Example7_5 {
    public static void main(String[] args) {
        var objSuper = new Example7_5_Sup_Class("super class");
        var objA = new Example7_5_FirstSub_Class("class A", 0);
        var objB = new Example7_5_SecondSub_Class("class B", '$');

        objSuper.show();
        objA.show();
        objB.show();

        Example7_5_Sup_Class obj;

        obj = objA;
        obj.show();

        obj = objB;
        obj.show();
    }
}