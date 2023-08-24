package taskfour;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class WriteQueue {
    public static Queue<String> getQueue(String fileName) {
        Queue<String> queue = new LinkedList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                queue.add(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return queue;
    }

    public static void printQueue(Queue<String> queue) {
        Random random = new Random();
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
            try {
                Thread.sleep((random.nextInt(3) + 1) * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
