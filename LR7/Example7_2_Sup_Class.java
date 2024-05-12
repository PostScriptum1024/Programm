public class Example7_2_Sup_Class {
    private String line;

    Example7_2_Sup_Class (String line) {
        this.line = line;
    }

    public void setLine() {
        this.line = "";
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getLineLength() {
        return this.line.length();
    }
}