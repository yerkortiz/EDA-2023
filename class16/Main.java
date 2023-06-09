import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<Integer, String>();
        h.put(5, "hola");
        h.put(5, "hola2");
        System.out.println(h.get(5));
    }
}