public class Example7_2 {
    public static void main(String[] args) {

        var Obj = new Example7_2_Sup_Class("text");

        System.out.println(Obj.getLineLength());

        Obj.setLine();
        System.out.println(Obj.getLineLength());

        Obj.setLine("new line");
        System.out.println(Obj.getLineLength());

        var Obj2 = new Example7_2_Sub_Class("text2", 2);

        System.out.println(Obj2.getLineLength() + "\n" + Obj2.number);

        Obj2.setLine();
        System.out.println(Obj2.getLineLength() + "\n" + Obj2.number);

        Obj2.setLine("new line");
        System.out.println(Obj2.getLineLength() + "\n" + Obj2.number);

        Obj2.setNumber(100);
        System.out.println(Obj2.getLineLength() + "\n" + Obj2.number);

        Obj2.setLineAndNumber("new line 2", 0);
        System.out.println(Obj2.getLineLength() + "\n" + Obj2.number);
    }
}