import java.util.Arrays;
import java.util.Random;

public class Example3_10 {
    public static void main(String[] args) {

        int nums[] = new int[20];

        Random random = new Random();

        System.out.println("Massive");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
            System.out.println(nums[i]);
        }
        System.out.println("------------");
        System.out.println("Sort");

        Arrays.sort(nums);
        for(int i = nums.length-1; i >= 0; i--){
            System.out.println(nums[i]);
        }
    }
}
