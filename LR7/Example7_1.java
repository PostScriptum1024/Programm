public class Example7_1 {
    public static void main(String[] args) {
        var superObj = new Example7_1_Sup_Class("line example (superObj)");
        var subObj = new Example7_1_Sub_Class("line example (subObj)");
        var subObj2 = new Example7_1_Sub_Class("line example (subObj2)", "str example");

        Object obj;

        obj = superObj;
        System.out.println(obj.toString());

        obj = subObj;
        System.out.println(obj.toString());

        obj = subObj2;
        System.out.println(obj.toString());
    }
}
