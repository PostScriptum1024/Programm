public class Example7_4_Sup_Class {
    public char ch;

    Example7_4_Sup_Class(char ch) {
        this.ch = ch;
    }

    Example7_4_Sup_Class(Example7_4_Sup_Class obj) {
        this.ch = obj.ch;
    }
}