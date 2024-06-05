
public class Example12_4 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++){
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
            });

            thread.setName("Thread " + i);
            thread.start();
        }
    }
}
