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
        Album album = albumList.get("17cd04a4-ef0a-468f-9f47-5d9dbb1c0dbd");
        assertEquals("Nightcall", album.getAlbumTitle());
        Album albumTitleTwo = albumList.get("f23844ec-3e6f-4e92-afc2-578c3d1fac7a");
        assertEquals("Discovery", albumTitleTwo.getAlbumTitle());
    }

}
