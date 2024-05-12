public class Example7_1_Sup_Class {
    private String line;
    Example7_1_Sup_Class (String line) {
        this.line = line;
    }
    Example7_1_Sup_Class () {

    }

    @Override
    public String toString() {
        String superClass;
        superClass = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "line = \"" + this.getLine() + "\"" + "\n";

        return superClass;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getLine() {
        return this.line;
    }
}