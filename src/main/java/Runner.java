import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String... args) {
        List<Album> albums = readAlbums("/Users/john/Desktop/bbc_coding_challenge/src/main/java/rms_albums.csv");

        for (Album album : albums) {
            System.out.println(album);
        }
    }

}
