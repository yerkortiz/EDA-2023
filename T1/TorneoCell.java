package T1;

import java.util.*;
public class TorneoCell {


    public static class Participante{
        String Nombre;
        int Poder;
        Participante(String nombre, int poder) {
            this.Nombre = nombre;
            this.Poder = poder;
        }
    }

    public static class CompareByPoder implements Comparator<Participante>{
    public int compare(Participante a, Participante b) {
        return a.Poder - b.Poder;
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        Participante[] torneo = new Participante[N];
        for(int i = 0; i < N; i++) {
            String nombre = stdin.next();
            int poder = stdin.nextInt();
            torneo[i] = new Participante(nombre, poder);
        }       
        Arrays.sort(torneo, new CompareByPoder());
        for(int i = 0; i < torneo.length; i++) {
            System.out.printf("%s %d\n", torneo[i].Nombre, torneo[i].Poder);
        }
        stdin.close();
    }
}
