import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example12_6 {
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
        List<Integer> summ_elements = new CopyOnWriteArrayList<>();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < count_cores; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < array.length; j++) {
                    AL_elements.add(array[j]);
                }
                int summ = 0;
                for (Integer num : AL_elements){
                    summ +=  num;
                }
                summ_elements.add(summ);
            });
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int end_summ = summ_elements.stream()
                .max(Integer::compare)
                .get();

        System.out.println("\n" + "Сумма элементов массива: " + end_summ/count_cores);
    }
}
