public class Example6_1_class {

    private char symbol;

    private String text;

    public Example6_1_class(){
        this.symbol = ' ';
        this.text = "";
    }

    public void set_value(char symbol){
        this.symbol = symbol;
    }

    public void set_value(String text){
        this.text = text;
    }

    public void set_value(char[] array){
        if (array.length == 1){
            this.symbol = array[0];
        }
        else{
            this.text = new String(array);
        }
    }

    public void print_value(){
        System.out.println("Symbol " + this.symbol);
        System.out.println("Text " + this.text);
    }
}
