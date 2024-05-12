public class Example7_2_Sub_Class extends Example7_2_Sup_Class {
    public int number;

    Example7_2_Sub_Class (String line, int number) {
        super(line);
        this.number = number;
    }

    @Override
    public void setLine() {
        super.setLine();
    }

    @Override
    public void setLine(String line) {
        super.setLine(line);
        this.number = super.getLineLength();
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLineAndNumber (String line, int number) {
        super.setLine(line);
        this.number = number;
    }
}