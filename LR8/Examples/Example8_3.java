package Examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

//Прочитать и вывести на экран информацию из предварительно
//созданного файла с использованием буфера в 5 байт.

public class Example8_3 {
    // Считывание по 5 симболов (буфер)
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) {      // Если не конец файла
                System.out.println("Count = " + count
                        + ", buff = " + Arrays.toString(buff)
                        + ", str = " + new String(buff, 0, count, "cp1251")); //"UTF8"
            } else break;
        }
    }

    public static void main(String[] args) {
        String fileName = "D:\\Files\\MyFile2.txt";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException ex) {
            System.out.println("Open/Close error " + fileName + ex);
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /*NOP*/
                    // No OPeration - ничего не делать
                }
            }
        }
    }
}