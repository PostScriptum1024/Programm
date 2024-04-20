import java.util.Random;

public class Example3_9 {
    public static void main(String[] args) {

        int nums[] = new int[20];

        Random random = new Random();

        int min = 99999;

        System.out.println("Massive");
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(100);
            System.out.println(nums[i]);
            if (nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println("-------------------------");
        System.out.println("Min element");
        System.out.println(min);
        System.out.println("-------------------------");
        System.out.println("Index");

        for (int i = 0; i < nums.length; i++){
            if (min == nums[i]){
                System.out.println(i);
            }
        }
    }
}
