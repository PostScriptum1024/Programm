public class Example3_8 {
    public static void main(String[] args) {

        int n = 10;
        char[] Alphabet = new char[n];
        char[] exception = new char[]{'A', 'E', 'I', 'O', 'U', 'Y'};
        char b = 'B';

        for (int i = 0; i < n; i++) {
            Boolean state = true;
            for (int j = 0; j < exception.length; j++) {
                if (b == exception[j]) {
                    i--;
                    state = false;
                    break;
                }
            }
            if (state) {
                Alphabet[i] = b;
            }
            b++;
        }

        for (int k = 0; k < n; k++) {
            System.out.print(Alphabet[k]);
        }
    }
}
