import java.util.HashMap;
import java.util.LinkedHashMap;

public class AlbumService {

    private LinkedHashMap<String, Album> albumLinkedHashMap;

    public AlbumService(LinkedHashMap<String, Album> albumLinkedHashMap) {
        this.albumLinkedHashMap = albumLinkedHashMap;
    }

    public void createAlbum(String uuid, String albumTitle, String artist, String yearReleased){
        Album album = new Album(uuid, albumTitle, artist, yearReleased);
        this.albumLinkedHashMap.put(album.getUuid(), album);
    }

    public LinkedHashMap<String, Album> getAlbumLinkedHashMap() {
        return albumLinkedHashMap;
    }
}
