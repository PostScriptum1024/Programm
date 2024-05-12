public class Example7_5_SecondSub_Class extends Example7_5_Sup_Class {
    protected char ch;

    Example7_5_SecondSub_Class(String line, char ch) {
        super(line);
        this.ch = ch;
    }

    @Override
    void show() {
        System.out.println("Class name: " + getClass().getSimpleName() + "; line = " + this.line +
                ", ch = " + this.ch);
    }
}