import java.util.Stack;

class Parenthesis {

    public static boolean CheckExpression(String s){
        Stack<Character> st = new Stack<Character>();
        char[] charArr = s.toCharArray();
        for (char c : charArr) {
            switch (c) {
                case '(', '[', '{':
                    st.push(c);
                    continue;
                case '}':
                    if(st.empty() || st.peek() != '{') {
                        return false;
                    }
                    st.pop();
                    continue;
                case ')':
                    if(st.empty() || st.peek() != '(') {
                        return false;
                    }
                    st.pop();
                    continue;
                case ']':
                    if(st.empty() || st.peek() != '[') {
                        return false;
                    }
                    st.pop();
                    continue;
                default:
                    return false;
            }
        }

        if(!st.empty()) {
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String valid1 = "()";
        String valid2 = "([])";
        String valid3 = "([]){([])[]}";
        String valid4 = "[{}[]()]";
        System.out.println(CheckExpression(valid1));
        System.out.println(CheckExpression(valid2));
        System.out.println(CheckExpression(valid3));
        System.out.println(CheckExpression(valid4));
        String invalidExpr1 = "([])){([])[]}";
        String invalidExpr2 = "[{}[]()](";
        System.out.println(CheckExpression(invalidExpr1));
        System.out.println(CheckExpression(invalidExpr2));
    }
}