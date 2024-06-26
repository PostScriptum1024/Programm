package Examples;

import java.io.*;

public class Example8_6 {
    public static void main(String[] args) throws IOException{
        Reader in = null;
        Writer out = null;

        try {
            in = new FileReader("D:\\Files\\MyFile1.txt");
            out = new FileWriter("E:\\Files\\MyFile2.txt", true); // true разрешает добавление

            // Данные считываются и записываются побайтно как и для InputStream/OutputStream
            int oneByte; // Переменная в которую считываются данные
            while ((oneByte = in.read()) != -1) {
                //out.write((char) oneByte); // Перезапись
                out.append((char) oneByte); // Добавление

                System.out.println((char) oneByte);
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
        finally {
            assert in != null;
            in.close();
            assert out != null;
            out.close();
        }
    }
}
