import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AlbumReader {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "/Users/john/Desktop/bbc_coding_challenge/src/main/java/rms_albums.csv";

        ArrayList<String> albums = new ArrayList<>();

        //Create an instance of scanner
        try (Scanner scanner = new Scanner(new File(path))) {



            //Get all tokens and store them
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(",");
                for (String token : tokens) {
                    System.out.println(token);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}