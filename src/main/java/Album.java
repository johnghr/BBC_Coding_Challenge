public class Album {

    private String uuid;
    private String albumTitle;
    private String artist;
    private String yearReleased;

    public Album(String uuid, String albumTitle, String artist, String yearReleased) {
        this.uuid = uuid;
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.yearReleased = yearReleased;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(String yearReleased) {
        this.yearReleased = yearReleased;
    }
}
