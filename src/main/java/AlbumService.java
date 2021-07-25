import sun.tools.jconsole.JConsole;

import java.util.*;
import java.util.stream.Collectors;

public class AlbumService {

    private LinkedHashMap<String, Album> albumLinkedHashMap;
    private Album foundAlbum;


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

    public Album getAlbumById(String uuid) {
        if(albumLinkedHashMap.containsKey(uuid) == false){
            System.out.println("Album was not found");
        } else {
            foundAlbum = albumLinkedHashMap.get(uuid);
        }
        return foundAlbum;
    }

    public List<Album> findAllAlbumsByArtist(String artistToFind) {
        return albumLinkedHashMap.values().stream()
                .filter(album -> album.getArtist().equals(artistToFind))
                .collect(Collectors.toList());
    }

    public void updateAlbumYearReleased(Album album, String year) {
        album.setYearReleased(year);
    }

    public void delete (String uuidToFind) {
        Album value = albumLinkedHashMap.remove(uuidToFind);
    }


}
