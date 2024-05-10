public class Example5_5_class {
    Example5_5_class() {
    }
    Example5_5_class(int num) {
        setNum(num);
    }
    private int num;

    public void setNum() {
        this.num = 0;
    }
    public void setNum(int num) {
        if (num > 100) {
            this.num = 100;
        }
        else {
            this.num = num;
        }
    }

    public int getNum() {
        return num;
    }
}
