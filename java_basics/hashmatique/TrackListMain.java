import java.util.HashMap;
import java.util.Set;

public class TrackListMain {
    public static void main(String[] args){
        TrackList list = new TrackList();

        // Create a HashMap of Songs
        HashMap<String, String> songs = new HashMap<String, String>();
        songs.put("Song 1", "Country Roads");
        songs.put("Song 2", "Take me Home");
        songs.put("Song 3", "To the place");
        songs.put("Song 4", "I belong");

        // Print One Song using Title
        list.printOneSong(songs, "Song 3");     

        // Print All Songs in Track List
        list.printAllSongs(songs);
    }
}