package class17;

import java.util.*;

public class Graph {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int E = in.nextInt();
        boolean[][] mtrx = new boolean[V][V];
        for(int i = 0; i < E; ++i) {
            int u = in.nextInt(), v = in.nextInt();
            mtrx[u - 1][v - 1] = true;
            // mtrx[v - 1][u - 1] = true; //comentar esto para grafo dirigido
        }

        //Imprimir grafo
        for(int i = 0; i < V; ++i) {
            for(int j = 0; j < V; ++j) {
                System.out.print(mtrx[i][j] + " ");
            }
            System.out.println();
        }
        
        Queue<Integer> cola = new LinkedList<>();
        boolean[] visited = new boolean[V];
        cola.offer(0);//encolo
        visited[0] = true;//visitado
        while(cola.isEmpty() == false) { // mientras la cola no esté vacía
            int temp = cola.poll();//saco el primero de la cola
            System.out.println(temp);
            for(int i = 0; i < V; ++i) { //encolo y marco como visitados, todos los nodos
                if(mtrx[temp][i] == true && visited[i] == false){ // que son hijos de temp y no han sido visitados
                    cola.offer(i);
                    visited[i] = true;
                }
            }
        }
        
        // //DFS(1)   
        // Stack<Integer> pila = new Stack<Integer>(); 
        // boolean[] visited2 = new boolean[V];
        // pila.push(0);
        // visited2[0] = true;
        // while(pila.isEmpty() == false) {
        //     int temp = pila.pop();
        //     System.out.println(temp);
        //     for(int i = 0; i < V; ++i) {
        //         if(mtrx[temp][i] == true && visited2[i] == false){
        //             pila.push(i);
        //             visited2[i] = true;
        //         }
        //     }
        // }

    }
}
