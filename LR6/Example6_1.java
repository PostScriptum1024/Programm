public class Example6_1 {
    public static void main(String[] args) {
        Example6_1_class instance = new Example6_1_class();

        instance.set_value('a');
        instance.print_value();

        instance.set_value("Print the world!");
        instance.print_value();

        char[] array = {'a', 'b', 'c'};
        instance.set_value(array);
        instance.print_value();
    }
}
