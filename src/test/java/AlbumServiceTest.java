import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

public class AlbumServiceTest {

    AlbumService albumService;
    AlbumReader albumReader;
    File file;
    LinkedHashMap<String, Album> albumHashMap;
    String uuid;
    String albumTitle;
    String artist;
    String yearReleased;

    @Before
    public void setUp(){
        albumReader = new AlbumReader();
        file = new File("/Users/john/Desktop/bbc_coding_challenge/src/main/java/rms_albums.csv");
        albumHashMap = albumReader.readAlbums(file);
        albumService = new AlbumService(albumHashMap);
        uuid = "6491bae8-fc48-42eb-a593-fae2a0003a3a";
        albumTitle = "Franz Ferdinand";
        artist = "Franz Ferdinand";
        yearReleased = "2004";

    }

    @Test
    public void albumServiceCanCreateTrack(){
        albumService.createAlbum(uuid, albumTitle, artist, yearReleased);
        int albumLinkedHashMapLength = albumService.getAlbumLinkedHashMap().size();
        assertEquals(13, albumLinkedHashMapLength);
    }

    @Test
    public void albumServiceCanGetAlbumById(){
        albumService.createAlbum(uuid, albumTitle, artist, yearReleased);
        String result = albumService.getAlbumById(uuid);
        assertEquals("Franz Ferdinand", result);
        String resultTwo = albumService.getAlbumById("f337fd51-7bf5-44bf-9553-5826162bc83a");
        assertEquals(resultTwo, "Pink Noise");
    }

    @Test
    public void albumServiceCanFindAllAlbumByArtist(){

    }
}
