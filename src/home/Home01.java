package home;
import java.io.*; //библиотека чтения-записи
import java.nio.Buffer;


public class Home01 {
    public static void main(String[] args) {
        String username = new NameFile().nameFile1();


        if (username != null) {
            System.out.println("Привет "+username+"!");
            //System.out.println("Привет!");
        }
        else {
            System.out.println("Hello!");
            System.out.println(username);

        }



    }
}
