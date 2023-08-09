
public class SongNotFoundException extends Exception {
    public SongNotFoundException(String songName) {
        System.out.println("Song not found: " + songName);
    }
}
