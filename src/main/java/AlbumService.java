import sun.tools.jconsole.JConsole;

import java.util.*;

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

    public ArrayList<Album> findAllAlbumsByArtist(String artistToFind) {
        ArrayList<Album> foundAlbums = new ArrayList<>();
        Iterator iterator = albumLinkedHashMap.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry mapElement = (Map.Entry) iterator.next();
            Album currentAlbum = (Album)mapElement.getValue();
            String albumArtist = currentAlbum.getArtist();
            if(albumArtist.equals(artistToFind)){
                foundAlbums.add(currentAlbum);
            }
        }
        if (foundAlbums.size() == 0){
            System.out.println("no albums were found");
        }

        return foundAlbums;

    }

    public void updateAlbumYearReleased(Album album, String year) {
        album.setYearReleased(year);
    }

    public void delete(String uuidToFind) {
        Iterator iterator = albumLinkedHashMap.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry mapElement = (Map.Entry) iterator.next();
            Album currentAlbum = (Album)mapElement.getValue();
            String albumUuid = currentAlbum.getUuid();
            if(albumUuid.equals(uuidToFind)){
               albumLinkedHashMap.remove(currentAlbum);
            }
        }
    }

}
