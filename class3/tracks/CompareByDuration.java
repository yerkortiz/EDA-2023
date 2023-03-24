package tracks;

import java.util.Comparator;

public class CompareByDuration implements Comparator<Track>{
    public int compare(Track a, Track b) {
        return a.durationMS - b.durationMS;
    }
}
