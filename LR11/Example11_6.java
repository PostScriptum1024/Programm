import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;


public class Example11_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Введите любое число");
        int number = in.nextInt();

        System.out.println("\n" + "Список случайных чисел:" + "\n");
        for (int i = 0; i < 10; i++){
            numbers.add(random.nextInt(100));
            System.out.println(numbers.get(i));
        }

        List<Integer> numbers_without_remainder = find_numbers_WR(numbers, number);

        System.out.println("\n" + "Числа из списка, которые делятся" +
                            "\n" +  "без остатка на ваше число:" + "\n");
        for (Integer i : numbers_without_remainder){
            System.out.println(i);
        }
    }

    public static List<Integer> find_numbers_WR(List<Integer> list, Integer number){
        return list.stream()
                .filter(x -> x % number == 0)
                .collect(Collectors.toList());
    }
}
