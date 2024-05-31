import java.util.stream.Collectors;
import java.util.List;

public class Example11_3 {
    public static void main(String[] args) {
        String string = "Напишите функцию, Которая принимает на вход список строк и " +
                "возвращает новый список, содержащий только те строки, которые " +
                "начинаются с большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования:" + "\n");
        for (String e : strings){
            System.out.println(e);
        }

        List<String> string_after = filterCapitalisedStrings(strings);

        System.out.println("\n" + "Строка после преобразования" + "\n");
        for (String e : string_after) {
            System.out.println(e);
        }
    }

    public static List<String> filterCapitalisedStrings(List<String> list){
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
