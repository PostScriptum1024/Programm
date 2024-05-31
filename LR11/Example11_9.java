import java.util.List;
import java.util.stream.Collectors;

public class Example11_9 {
    public static void main(String[] args) {

        List<String> words = List.of("Hello","w0rld","excellent","f*ck","d@g");
        List<Character> symbols = List.of('1','2','3','4','5','6','7','8','9','0','!','@','#','$','%','^','&','*','(',')','_','+'); // и тому подобное
        System.out.println("\n" + "Список до преобразования:" + "\n");
        for (String s : words){
            System.out.println(s);
        }

        List<String> words_after_correction = without_symbols(words, symbols);
        System.out.println("\n" + "Список после преобразования:" + "\n");

        for (String s : words_after_correction){
            System.out.println(s);
        }
    }

    static public List<String> without_symbols(List<String> words, List<Character> symbols){
        return words.stream()
                .filter(s -> s.chars() // преобразуем строку в целочисленный поток (значения символов в Unicode)
                        .noneMatch(ch -> symbols.contains((char) ch))) // Целочисленный поток конвертируется в символы,
                                                                        // находятся совпадения между 2 списками символов
                                                                        // и метод .noneMatch исключает из выборки совпадения с двух списков
                .collect(Collectors.toList());
    }
}
