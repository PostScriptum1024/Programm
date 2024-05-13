package Examples_plus;

import java.io.*;
import java.util.Scanner;

public class Example888 {
    public static void main(String[] args) throws IOException {
        final int stringCount = 2;
        final int doubleCount = 5;

        Scanner scanner = new Scanner(System.in);
        DataOutputStream wr = null;
        DataInputStream rd = null;

        try {
            // Создание и заполнение файла для дальнейшего чтения
            File readFile = new File("Example_text_file_1.txt");
            readFile.delete();
            if (readFile.createNewFile()) {
                wr = new DataOutputStream(new FileOutputStream(readFile.getAbsolutePath()));

                System.out.println("Enter the lines to write to the file: ");
                for (int i = 0; i < stringCount; i++)
                    wr.writeUTF(scanner.nextLine());

                System.out.println("Enter double values to write to the file: ");
                for (int i = 0; i < doubleCount; i++)
                    wr.writeUTF(scanner.nextLine());

                wr.flush();
                wr.close();
            } else
                System.out.println("Can't create the file: " + readFile.getName());

            // Переписываем нужные значения из первого файла во второй
            File writeFile = new File("Example_text_file_2.txt");
            writeFile.delete();
            if (writeFile.createNewFile()) {
                rd = new DataInputStream(new FileInputStream(readFile.getAbsolutePath()));
                wr = new DataOutputStream(new FileOutputStream(writeFile.getAbsolutePath()));

                try {
                    String line;
                    int lineCount = 0;
                    while ((line = rd.readUTF()) != null) {
                        lineCount++;

                        if (lineCount == stringCount) {
                            wr.writeUTF(line + "\n");
                            continue;
                        } else if (lineCount > stringCount) {
                            try {
                                double value = Double.parseDouble(line);
                                if (value > 0)
                                    wr.writeUTF(line + "\n");
                            } catch (NumberFormatException ex) {
                                /*NOP*/
                            }
                        } else
                            continue;
                    }
                } catch (IOException ex) {
                    System.out.println("End of the file");
                }
            } else
                System.out.println("Can't create the file: " + writeFile.getName());
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        } finally {
            rd.close();
            wr.close();
        }
    }
}
