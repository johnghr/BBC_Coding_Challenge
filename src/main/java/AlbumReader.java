import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AlbumReader {

    public static void main(String[] args) throws FileNotFoundException{

        //Create an instance of scanner
        Scanner scanner = new Scanner(new File("/Users/john/Desktop/bbc_coding_challenge/src/main/java/rms_albums.csv"));

        //Set the delimiter
        scanner.useDelimiter(",");

        //Get all tokens and store them
        while (scanner.hasNext()){
            System.out.print(scanner.next() + "|");
        }

        //Close the scanner
        scanner.close();
    }

}
