package T1;
import java.util.*;
public class DueloKarate{
    public static class Peleador{
        
        int vida;
        int resistencia;
        int durabilidad;
        int ataque;
        int patada;
        int numero;
        
        Peleador(int vida, int resistencia, int durabilidad, int ataque, int patada, int numero){
            this.vida = vida;
            this.resistencia = resistencia;
            this.durabilidad = durabilidad;
            this.ataque = ataque;
            this.patada = patada;
            this.numero = numero;
        }
        
        int getVida(){return vida;}
        void setVida(int vida){this.vida = vida;}
        
        int getResistencia(){return resistencia;}
        void setResistencia(int resistencia){this.resistencia = resistencia;}

        int getDurabilidad(){return durabilidad;}
        void setDurabilidad(int durabilidad){this.durabilidad = durabilidad;}

        int getAtaque(){return ataque;}
        void setAtaque(int ataque){this.ataque = ataque;}

        int getPatada(){return patada;}
        void setPatada(int patada){this.patada = patada;}

        int getNumero(){return numero;}
        void setNumero(int numero){this.numero = numero;}
        
        void RecibeAtaque(int ataqueRecibido){
            if (getDurabilidad() > 0) {
                durabilidad--;
                setVida(getVida() - (ataqueRecibido - getResistencia()));
            } else {
                setVida(getVida() - ataqueRecibido);
            }
        }
    }
    public static Peleador duelo(Queue<Peleador> torneo){
        Peleador atacante = torneo.poll(); 
        while (!torneo.isEmpty()){
            Peleador defensor = torneo.poll();            
            while (defensor.getVida() > 0 && atacante.getVida() > 0){
                if (atacante.getPatada() == defensor.getVida()){
                    defensor.setVida(0);
                    break;
                }
                defensor.RecibeAtaque(atacante.getAtaque());
                if (defensor.getVida() > 0){
                    Peleador temp = defensor;
                    defensor = atacante;
                    atacante = temp;
                }
            }
        }  
        return atacante;
    }
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        int V,R,D,A,P;
        int n = stdin.nextInt();
        Queue<Peleador> torneo = new LinkedList<>();
        for (int i = 0 ; i < n ; i++){
           V = stdin.nextInt();
           R = stdin.nextInt();
           D = stdin.nextInt();
           A = stdin.nextInt();
           P = stdin.nextInt();
           torneo.add(new Peleador(V, R, D, A, P,i+1));
        }  
        stdin.close();
        
        Peleador ganador = duelo(torneo);
        if(ganador.getNumero() == 1){
            System.out.printf("gane yo :D");
        } else {
            System.out.printf("%d\n", ganador.getNumero());
        }   
    } 
}