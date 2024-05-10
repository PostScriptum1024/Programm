public class Example5_2_class {

    private char symbol_1;
    private char symbol_2;

    public void set_symbol_1(char symbol_1){
        this.symbol_1 = symbol_1;
    }

    public void set_symbol_2(char symbol_2){
        this.symbol_2 = symbol_2;
    }

    public void print_symbols(){
        for (char i = symbol_1; i <= symbol_2; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
