public class Album {

    private String uuid;
    private String albumTitle;
    private String artist;
    private int yearReleased;

    public Album(String uuid, String albumTitle, String artist, int yearReleased) {
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

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }
}
