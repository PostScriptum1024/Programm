import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example11_4 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список случайных чисел:" + "\n");
        for (int i = 0; i < 10; i++){
            integers.add(random.nextInt(10));
            System.out.println(integers.get(i));
        }

        List<Integer> integer_square = func_square(integers);

        System.out.println("\n" + "Список квадратов этих чисел:" + "\n");
        for (Integer i : integer_square){
            System.out.println(i);
        }
    }

    public static List<Integer> func_square(List<Integer> list){
        return list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }
}
