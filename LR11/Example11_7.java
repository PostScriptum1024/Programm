import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example11_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> words = List.of("I","You","Name","Apple","Window","Vegetable","Advertisement");

        System.out.println("\n" + "Введите число, означающее минимальную длину выводимых слов:" + "\n");
        int lenght = in.nextInt();

        List<String> longer_words = find_a_long_words(words, lenght);

        System.out.println("\n" + "Слова из списка, удовлетворяющие условию:" + "\n");
        for (String s : longer_words){
            System.out.println(s);
        }
    }

    public static List<String> find_a_long_words(List<String> list, int lenght){
        return list.stream()
                .filter(word -> word.length() > lenght)
                .collect(Collectors.toList());
    }
}
