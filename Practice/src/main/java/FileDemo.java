import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

    public class FileDemo {
        public static void main(String[] args) throws IOException {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("/Users/bollampally.anvitha/Desktop/Practice/src/main/java/Karimnagar"));
                String firstString = reader.readLine();
                System.out.println(firstString);
            }
            catch (FileNotFoundException e){
            System.out.println("Error! File not found!");
                e.printStackTrace();
            } finally {
                System.out.println ("And here's the finally block!");

        }
    }
    }