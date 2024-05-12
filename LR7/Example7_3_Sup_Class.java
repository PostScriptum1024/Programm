public class Example7_3_Sup_Class {
    public int number;

    Example7_3_Sup_Class(int number) {
        this.number = number;
    }

    public void setValues(int number) {
        this.number = number;
    }

    public String toString() {
        return "Class name: " + getClass().getSimpleName() + "; " +
                "number = " + this.number;
    }
}