package class9;

public class ReversePolish {
    public static int ReversePolish(String[] tokens) {
        int i = 0;
        int lastNum = -1;
        while (i < tokens.length) {
            if ("/*+-".contains(tokens[i])) {
                int val1 = Integer.valueOf(tokens[lastNum - 1]);
                // get the last number
                // seen
                int val2 = Integer.valueOf(tokens[lastNum]);
                // initialize a variable for
                // storing the result of the
                // operation
                int ans = 0;
                // perform the operation based
                // on the operator
                if (tokens[i].equals("*"))
                    ans = val1 * val2;
                else if (tokens[i].equals("/"))
                    ans = val1 / val2;
                else if (tokens[i].equals("+"))
                    ans = val1 + val2;
                else if (tokens[i].equals("-"))
                    ans = val1 - val2;
                // update the second-to-last
                // number with the result
                tokens[lastNum - 1] = Integer.toString(ans);
                // update the index of the last
                // number seen
                lastNum--;
            }
            // if the current token is a number
            else {
                // increment the index of the
                // last number seen
                lastNum++;
                // add the number to the
                // next available index in
                // the array
                tokens[lastNum] = tokens[i];
            }
            i++; // increment the counter for iterating over
                 // the tokens
        }
        return Integer.valueOf(
            tokens[lastNum]); // return the final result
    }
}
