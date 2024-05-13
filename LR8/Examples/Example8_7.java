package Examples;

import java.io.*;

public class Example8_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // Создание файловых символьных потоков для чтения и записи
            br = new BufferedReader(new FileReader("D:\\Files\\MyFile1.txt"), 1024); // Вторым аргументом указывается размер буфера в байтах
            bw = new BufferedWriter(new FileWriter("E:\\Files\\MyFile2.txt"));

            int lineCount = 0; // Счетчик строк
            String line;

            // Переписывание информации из одного файла в другой
            while ((line = br.readLine()) != null) {
                lineCount++;
                System.out.println("lineCount: " + lineCount);
                bw.write(line);
                bw.newLine(); // Переход на новую строку
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
        finally {
            assert br != null;
            br.close();
            assert bw != null;
            bw.flush();
            bw.close();
        }
    }
}
