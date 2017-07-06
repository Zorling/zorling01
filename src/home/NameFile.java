package home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NameFile {

    public static String n,c;
    public  String nameFile1(){

    try (BufferedReader br = new BufferedReader(new FileReader("c:\\1\\name.txt")))
    {

        while ((c=br.readLine())!=null){
            n = c;
            //System.out.println(n);  // ! ОП - отладочная печать

        }

    }
    catch (IOException e) {
        e.printStackTrace();
    }
        return n;
    }
}

