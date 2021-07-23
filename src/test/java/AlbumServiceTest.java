import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
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
    Album album;

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
        album = new Album(uuid, albumTitle, artist, yearReleased);

    }

    @Test
    public void albumServiceCanCreateTrack(){
        albumService.createAlbum(uuid, albumTitle, artist, yearReleased);
        int albumLinkedHashMapLength = albumService.getAlbumLinkedHashMap().size();
        assertEquals(13, albumLinkedHashMapLength);
        assertEquals("Franz Ferdinand", albumService.getAlbumById(uuid).getArtist());
    }

    @Test
    public void albumServiceCanGetAlbumById(){
        albumService.createAlbum(uuid, albumTitle, artist, yearReleased);
        String result = albumService.getAlbumById(uuid).getAlbumTitle();
        assertEquals("Franz Ferdinand", result);
        String resultTwo = albumService.getAlbumById("f337fd51-7bf5-44bf-9553-5826162bc83a").getAlbumTitle();
        assertEquals(resultTwo, "Pink Noise");
    }

    @Test
    public void albumServiceCanFindAllAlbumByArtist(){
        ArrayList<Album> foundAlbums = albumService.findAllAlbumsByArtist("Gorillaz");
        assertEquals(3 ,foundAlbums.size());
        String albumTitle = foundAlbums.get(0).getAlbumTitle();
        assertEquals("Demon Days",albumTitle);
        String albumTitleTwo = foundAlbums.get(1).getAlbumTitle();
        assertEquals("Plastic Beach", albumTitleTwo);
    }

    @Test
    public void albumServiceCanUpdateAlbum(){
        album = albumService.getAlbumById("c2263b8c-6718-4494-8218-1e739cf04e0a");
        albumService.updateAlbumYearReleased(album, yearReleased);
        assertEquals("2004", album.getYearReleased());
    }

    @Test
    public void albumServiceCanRemoveAlbum(){
        albumService.delete(uuid);
        assertEquals(12, albumService.getAlbumLinkedHashMap().size());
    }

}
