public class Example7_5_FirstSub_Class extends Example7_5_Sup_Class{
    protected int num;

    Example7_5_FirstSub_Class(String line, int num) {
        super(line);
        this.num = num;
    }

    @Override
    void show() {
        System.out.println("Class name: " + getClass().getSimpleName() + "; line = " + this.line +
                ", num = " + this.num);
    }
}