public class ReverseString {
    public static String reverseStringRecursive(String s) {
        return String.valueOf(reversRecursive(s.toCharArray(), 0, s.length() - 1));
    }
    public static char[] reversRecursive(char[] s, int i, int j) {
        if(i >= j) {
            return s;
        }
        char t = s[i];
        s[i] = s[j];
        s[j] = t;
        return reversRecursive(s, i+1, j-1);
    }

    public static void reverseIterative(String s) {
        char[] charArray = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while(i < j){
            char t = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = t;
            i++;
            j--;
        }
        s = String.valueOf(charArray);
        System.out.println(s);
    }

    public static void reverseIterative2(String s) {
        for(int i = s.length() - 1; i >= 0; i--) {
            System.out.printf("%s ", s.charAt(i));
        }
    }

    public static void reverseRecursive2(String s, int i) {
        if(i == s.length()){
            return;
        }

        reverseRecursive2(s, i + 1);
        System.out.printf("%c ", s.charAt(i));
    }
    public static void main(String[] args) {
        //System.out.println(reverseString("HOLA"));
        reverseRecursive2("ARBOL", 0);
    }
}
