import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AlbumService {

    private LinkedHashMap<String, Album> albumLinkedHashMap;
    private String foundAlbum;

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

    public String getAlbumById(String uuid) {
        if(albumLinkedHashMap.containsKey(uuid) == false){
            System.out.println("Album was not found");
        } else {
            foundAlbum = albumLinkedHashMap.get(uuid).getAlbumTitle();
        }
        return foundAlbum;
    }
}
