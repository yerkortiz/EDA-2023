package tracks;
import java.util.*;

public class CompareByTrackName implements Comparator<Track>{
    public int compare(Track a, Track b) {
        return a.name.compareTo(b.name);
    }
}

