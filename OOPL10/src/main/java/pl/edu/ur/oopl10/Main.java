package pl.edu.ur.oopl10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Adrian Hrycaj
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {        
        z4 z4 = new z4();
        
        z4.dziel();
        
        WprowadzZKonsoli wprowadzzkonsoli = new WprowadzZKonsoli();
        
        wprowadzzkonsoli.wprowadzChar();
        wprowadzzkonsoli.wprowadzInt();
        wprowadzzkonsoli.wprowadzLong();
        
        //v---test---v
        try {
            FileReader fr = new FileReader("Char.txt");
        BufferedReader br = new BufferedReader(fr);
        Object stringRead = null;
        while (stringRead != null) {
            stringRead = br.readLine();
 
        }
        br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie można znaleźć pliku Char.txt");
        }
        
        
        
        FileWriter fwo = new FileWriter("Char.txt", true);
        BufferedWriter bwo = new BufferedWriter(fwo);
        bwo.write("xd");
        bwo.newLine();

        bwo.close();
        
    }
}
