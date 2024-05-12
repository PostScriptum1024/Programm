public class Example7_1_Sub_Class extends Example7_1_Sup_Class{
    private String str;

    Example7_1_Sub_Class (String line) {
        super(line);
        this.str = "";
    }

    Example7_1_Sub_Class (String line, String str) {
        super(line);
        this.str = str;
    }

    @Override
    public String toString() {
        String subClass;
        subClass = "Class name: " + getClass().getName() + "\n" +
                "line = \"" + this.getLine() + "\"" + "\n" +
                "str = \"" + this.getStr() + "\"" + "\n";

        return subClass;
    }

    public void setStr (String str) {
        this.str = str;
    }

    public String getStr() {
        return this.str;
    }
}