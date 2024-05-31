import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example11_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\n" + "Введите любое число от 0 до 100:" + "\n");
        int number = in.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            numbers.add(random.nextInt(100));
            System.out.println(numbers.get(i));
        }

        List<Integer> small_numbers = find_a_small_numbers(numbers, number);

        System.out.println("\n" + "Числа из списка, меньше введённого значения:" + "\n");
        for (Integer i : small_numbers){
            System.out.println(i);
        }
    }

    public static List<Integer> find_a_small_numbers(List<Integer> list, int number){
        return list.stream()
                .filter(numbers -> numbers < number)
                .collect(Collectors.toList());
    }
}
