public class Example7_3_SecondSub_Class extends Example7_3_FirstSub_Class {
    public String line;

    Example7_3_SecondSub_Class (int number, char symbol, String line) {
        super(number, symbol);
        this.line = line;
    }

    public void setValues (int number, char symbol, String line) {
        super.setValues(number, symbol);
        this.line = line;
    }

    public String toString() {
        return "Class name: " + getClass().getSimpleName() + "; " +
                "number = " + this.number + ", symbol = " + this.symbol + ", line = " + this.line;
    }
}