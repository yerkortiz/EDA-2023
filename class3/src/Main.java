package src;
import tracks.*;
import java.util.Arrays; 

public class Main {
    public static void main(String[] args) {
        // ordenar un arreglo
        int[] a = new int[5];
        a[0] = 5;
        a[1] = 2;
        a[2] = 6;
        a[3] = 10;
        a[4] = 1;
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        // arreglo de tracks
        Track[] tracks = new Track[4];
        tracks[2] = new Track("The Light", "The Light", "Common", 1);
        tracks[1] = new Track("Cancion1", "Album1", "Artist1", 103828);
        tracks[3] = new Track("Cancion2", "Album2", "Artist2", 27373);
        tracks[0] = new Track("Cancion3", "Album3", "Artist3", 13828);

        // ordenar un arreglo de objetos usando un comparador
        Arrays.sort(tracks, new CompareByTrackName());
        for(int i = 0; i < tracks.length; i++) {
            System.out.printf("\n nombre del track %s, nombre del artista %s, duracion %d \n", 
                tracks[i].name, tracks[i].artistName, tracks[i].durationMS);
        }
    }
}
