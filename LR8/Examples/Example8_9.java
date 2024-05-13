package Examples;

import java.io.*;

public class Example8_9 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            // Создание потоков для чтения и записи с нужной кодировкой
            br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Files\\MyFile1.txt"), "cp1251"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\Files\\MyFile2.txt"), "cp1251"));

            //Переписывание информации из одного файла в другой
            int lineCount = 0; // Счетчик строк
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + line);
                bw.write(lineCount + ": " + line);              // Запись без перевода строки
                bw.newLine();                                       // Принудительный переход на новую строку
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
