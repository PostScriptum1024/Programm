public class Example7_5_Sup_Class {
    protected String line;

    Example7_5_Sup_Class(String line) {
        this.line = line;
    }

    void show() {
        System.out.println("Class name: " + getClass().getSimpleName() + "; line = " + this.line);
    }
}