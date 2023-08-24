package taskfour;

import java.io.*;
import java.util.Scanner;

public class DivideText {
    public static void divideText(String fileName) {
        String part = "part";
        int count = 1;
        StringBuilder text = new StringBuilder();
        String buffer;
        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNextLine()) {
                buffer = scanner.nextLine();
                if(buffer.length() == 0 && text.length() > 0) {
                    String file = part + count++ +".txt";
                    try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                        writer.write(text.toString());
                        text.delete(0, text.length());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    text.append(buffer);
                    text.append("\r\n");
                }
            }
            String file = part + count++ +".txt";
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(text.toString());
                text.delete(0, text.length());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
