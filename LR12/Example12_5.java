import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example12_5 {
    public static void main(String[] args) throws InterruptedException{
        Runtime runtime = Runtime.getRuntime();
        int count_cores = runtime.availableProcessors();
        System.out.println("\n" + "Число ядер на вашем ПК: " + count_cores + "\n");

        Random random = new Random();
        int size = 20;
        int[] array = new int[size];
        System.out.println("Массив целых случайных чисел: ");
        for(int i = 0; i < size; i++){
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }

        List<Integer> AL_elements = new CopyOnWriteArrayList<>();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < count_cores; i++) {
            Thread thread = new Thread(() -> {
                int max_element = Integer.MIN_VALUE;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] > max_element) {
                        max_element = array[j];
                    }
                }
                AL_elements.add(max_element);
            });
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int maximum = AL_elements.stream()
                .max(Integer::compare)
                .get();
        System.out.println("\n" + "Максимальный элемент в массиве: " + maximum);
    }
}
