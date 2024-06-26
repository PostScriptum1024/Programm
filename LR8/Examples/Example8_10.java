package Examples;

import java.io.*;

public class Example8_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;

        try {
            // Создание потоков
            br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Files\\MyFile1.txt"), "cp1251"));
            out = new PrintWriter("E:\\Files\\MyFile2.txt", "cp1251");

            // Переписывание информации из одного файла в другой
            int lineCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + line);
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
