package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfCopySpeedComparison {

    public static void main(String[] args) {

        int b;
        int counter = 0;
        long start;
        long end;
        double elapsedTime;
        byte[] buffer = new byte[8192]; //8KB


        try (FileInputStream fis = new FileInputStream("C:/tmp/Starter-Rulebook.pdf");
             FileOutputStream fos = new FileOutputStream("C:/tmp/Starter-Rulebook-out.pdf")) {

            start = System.currentTimeMillis();
            while ((b = fis.read()) != -1) {
                fos.write(b);
                counter++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.println("Elapsed time: " + elapsedTime + "sec");
            System.out.printf("The file with size: %.1fKB (%d bytes) successfully copied!",
                    (counter / 1024.0), counter);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        System.out.println();
        try (FileInputStream fis = new FileInputStream("C:/tmp/Starter-Rulebook.pdf");
             FileOutputStream fos = new FileOutputStream("C:/tmp/Starter-Rulebook-out.pdf")) {

            start = System.currentTimeMillis();
            while ((b = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, b);
                counter++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.println("Elapsed time: " + elapsedTime + "sec");
            System.out.printf("The file with size: %.1fKB (%d bytes) successfully copied!",
                    (counter / 1024.0), counter);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
