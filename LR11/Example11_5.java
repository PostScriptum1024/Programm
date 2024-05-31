import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example11_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> words = List.of("Hello","apple","program","future","Name", "function");

        System.out.println("\n" + "Введите любой текст - 1 букву, или целое слово:" + "\n");
        String substring = in.nextLine();

        List<String> words_with_substring = find_substring(words, substring);
        System.out.println("\n" + "Строки, содержащие вашу подстроку:" + "\n");
        for (String s : words_with_substring){
            System.out.println(s);
        }
    }

    public static List<String> find_substring(List<String> list, String substring){
        return list.stream()
        .filter(s -> s.contains(substring))
        .collect(Collectors.toList());
    }
}
