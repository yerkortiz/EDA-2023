import java.util.Stack;
public class ReversePolishNotation {
    public int F3(String[] tokens) {
        Stack<Integer> stack= new Stack<Integer>();
        String str="+-*/";
        for(String s:tokens) {
            if(str.contains(s) && !stack.isEmpty()){
              int v1=stack.pop();
              int v2=stack.pop();

              switch(s){
                case "+": 
                    stack.push(v2+v1);
                    break;
                case "-": 
                    stack.push(v2-v1);
                    break;
                case "/": 
                    stack.push(v2/v1);
                    break;
                default:
                    stack.push(v2*v1);
                    break;
              }
            } else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }   
}
