import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlbumTest {

    Album album;

    @Before
    public void setUp(){
        album = new Album("17cd04a4-ef0a-468f-9f47-5d9dbb1c0dbd","Nightcall","Kavinsky","2011");
    }

    @Test
    public void hasUuid(){
        assertEquals("17cd04a4-ef0a-468f-9f47-5d9dbb1c0dbd", album.getUuid());
    }

    @Test
    public void hasAlbumTitle(){
        assertEquals("Nightcall", album.getAlbumTitle());
    }

    @Test
    public void hasArtist(){
        assertEquals("Kavinsky", album.getArtist());
    }

    @Test
    public void hasYearReleased(){
        assertEquals("2011", album.getYearReleased());
    }
}
