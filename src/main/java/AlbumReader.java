import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class AlbumReader {

    public static LinkedHashMap<String,Album> readAlbums(File file) {
        LinkedHashMap<String,Album> albumLinkedHashMap = new LinkedHashMap<>();

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
                Album album = new Album(uuid, albumTitle, artist, yearReleased);
                albumLinkedHashMap.put(album.getUuid(), album);

            }



        } catch (Exception e) {
            e.printStackTrace();
        }
        return albumLinkedHashMap;
    }

}