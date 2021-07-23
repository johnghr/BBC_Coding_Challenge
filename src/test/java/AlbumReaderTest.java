import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

public class AlbumReaderTest {

    AlbumReader albumReader;
    File file;
    LinkedHashMap<String, Album> albumList;

    @Before
    public void setUp(){
        albumReader = new AlbumReader();
        file = new File("/Users/john/Desktop/bbc_coding_challenge/src/main/java/rms_albums.csv");
    }

    @Test
    public void albumReaderReadsAlbumsToList(){
        albumList = albumReader.readAlbums(file);
        assertEquals(12, albumList.size());
//        Album albumTitle = albumList.get(1);
//        assertEquals("Nightcall", albumTitle.getAlbumTitle());
//        Album albumTitleTwo = albumList.get(11);
//        assertEquals("Discovery", albumTitleTwo.getAlbumTitle());
    }

}
