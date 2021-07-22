import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AlbumApplication {

    public static void main(String... args) throws FileNotFoundException {
        AlbumReader albumReader =  new AlbumReader();

        File file = new File("/Users/john/Desktop/bbc_coding_challenge/src/main/java/rms_albums.csv");

        albumReader.readAlbums(file);
    }

}
