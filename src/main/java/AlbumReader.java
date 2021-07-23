import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AlbumReader {

    public static ArrayList<Album> readAlbums(File file) {
        ArrayList<Album> albumsList = new ArrayList<>();

        //Create an instance of scanner
        try (Scanner scanner = new Scanner(file)) {

            //Get all tokens and store them
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] csvValues = line.split(",");

//              starting at index 4, assign values to variables for the length of csvValues
                String uuid = csvValues[0];
                String albumTitle = csvValues[1];
                String artist = csvValues[2];
                String yearReleased = csvValues[3];
                //construct album instances using csvValues stored in variables
                albumsList.add(new Album(uuid, albumTitle, artist, yearReleased));

            }



        } catch (Exception e) {
            e.printStackTrace();
        }
        return albumsList;
    }

}