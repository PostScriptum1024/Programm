public class Example3_7 {
    public static void main(String[] args) {

        int size = 10; //Переменная размера массива
        char letter = 'a';

        char Alphabet[] = new char[size]; //Символьный массив

        for (int i = 0; i < Alphabet.length; i++){ //Прямой порядок
            Alphabet[i] = letter;
            letter += 2;
            System.out.println(Alphabet[i]);
        }

        System.out.println("----------------------");

        for (int i = size-1; i >= 0; i--){ //Обратный порядок
            System.out.println(Alphabet[i]);
        }
    }
}