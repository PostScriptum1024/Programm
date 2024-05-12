public class Example7_4_FirstSub_Class extends Example7_4_Sup_Class {
    public String str;

    Example7_4_FirstSub_Class(char ch, String str) {
        super(ch);
        this.str = str;
    }

    Example7_4_FirstSub_Class(Example7_4_FirstSub_Class obj) {
        super(obj.ch);
        this.str = obj.str;
    }
}