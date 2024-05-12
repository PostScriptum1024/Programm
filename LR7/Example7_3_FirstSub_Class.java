public class Example7_3_FirstSub_Class extends Example7_3_Sup_Class{
    public char symbol;

    Example7_3_FirstSub_Class (int number, char symbol) {
        super(number);
        this.symbol = symbol;
    }

    public void setValues(int number, char symbol) {
        super.setValues(number);
        this.symbol = symbol;
    }

    public String toString() {
        return "Class name: " + getClass().getSimpleName() + "; " +
                "number = " + this.number + ", symbol = " + this.symbol;
    }
}