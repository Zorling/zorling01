package test;

/**
 * Created by MIIvanov on 05.07.2017.
 */
import java.io.*;
public class test {
    public static void test(String text) {

        try (FileWriter writer = new FileWriter("C:\\1\\notes3.txt", true)) {
            // запись всей строки

            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('\n');
            writer.append('E');
            writer.append('E');

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public static int suma(int x, int y) {

     int z = x+y;
     return(z);
    }
}
