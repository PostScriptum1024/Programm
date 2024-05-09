import java.util.Random;

public class Example4_6 {
    public static void main(String[] args) {

        int rows = 5;
        int columns = 10;

        int [][] array = new int[rows][columns];

        Random  random = new Random();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[i][j] = random.nextInt(100);
            }
        }

        int row_index = random.nextInt(rows);
        int columns_index = random.nextInt(columns);

        int [][] newArray = new int[rows-1][columns-1];

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i != row_index && j != columns_index) {
                    newArray[i < row_index ? i : i - 1][j < columns_index ? j : j - 1] = array[i][j];
                }
            }
        }

        System.out.println("Исходный массив: ");
        for (int[] row : array){
            for(int item : row){
                System.out.print(item + " ");
            }
            System.out.println();
        }

        System.out.println("Итоговый массив: ");
        for (int[] row : newArray){
            for(int item : row){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
