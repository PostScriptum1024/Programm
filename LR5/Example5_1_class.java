public class Example5_1_class {

    private char symbol;

    public void setSymbol(char symbol){
        this.symbol = symbol;
    }

    public int getCode(){
        return (int) symbol;
    }

    public void print(){
        System.out.println("Symbol: " + symbol + ", code: " + getCode());
    }
}
