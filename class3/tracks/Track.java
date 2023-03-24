package tracks;
public class Track {
    // atributos
    public String name;
    public String albumName;
    public String artistName;
    public int durationMS;

    // constructor
    public Track(String name, String albumName, String artistName, int durationMS){
        this.name = name;
        this.albumName = albumName;
        this.artistName = artistName;
        this.durationMS = durationMS;
    }

    // constructor vacio
    public Track() {
        this.name = "";
        this.albumName = "";
        this.artistName = "";
        this.durationMS = 0;
    }
}