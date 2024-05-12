public class Example7_4_SecondSub_Class extends Example7_4_FirstSub_Class {
    public int num;

    Example7_4_SecondSub_Class(char ch, String str, int num) {
        super(ch, str);
        this.num = num;
    }

    Example7_4_SecondSub_Class(Example7_4_SecondSub_Class obj) {
        super(obj.ch, obj.str);
        this.num = obj.num;
    }
}