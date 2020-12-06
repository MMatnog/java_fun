import java.util.HashMap;
import java.util.Set;

public class TrackList {
    // Print One Song using Title
    public void printOneSong(HashMap<String, String> songs, String title){
        if (songs.get(title) != null){    
            System.out.println("Title : " + title + ", Sample Lyrics : " + songs.get(title));
        } else {
            System.out.println("Song is not in the Track List.");
        }
    }
    
    // Print All Songs in TrackList
    public void printAllSongs(HashMap<String, String> songs){
        Set<String> titles = songs.keySet();
        System.out.println("All Songs : ");
        for (String title : titles){
            System.out.println("Title : " + title + ", Sample Lyrics : " + songs.get(title));
        }
    }
}