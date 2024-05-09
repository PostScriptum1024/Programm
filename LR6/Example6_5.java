public class Example6_5 {
    public static void main(String[] args) {

        System.out.println(sum_of_squares(5));
        System.out.println(sum_of_squares(25));
    }

    public static int sum_of_squares(int n){
        int result = 0;
        for (int i = 1; i <= n; i++){
            result += i * i;
        }
        return result;
    }
}
