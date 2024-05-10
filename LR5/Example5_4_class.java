public class Example5_4_class {
    Example5_4_class(int user_num, char user_symbol) {
        num = user_num;
        symbol = user_symbol;
    }

    Example5_4_class (double dot) {
        int symbol_code = (int) dot;
        int num_value = (int) ((dot - symbol_code) * 100);

        symbol = (char) symbol_code;
        num = num_value;
    }

    private char symbol;
    private int num;

    public char get_symbol() {
        return symbol;
    }

    public int get_num() {
        return num;
    }
}
