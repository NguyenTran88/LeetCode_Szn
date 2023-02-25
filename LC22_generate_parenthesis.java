import java.util.ArrayList;
import java.util.List;

/**
 * LC22_generate_parenthesis
 */
public class LC22_generate_parenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;

    }

    public void backtrack(List<String> ans, StringBuilder str, int open, int close, int max) {
        if (str.length() == 2 * max) {
            ans.add(str.toString());
            return;
        }
        if (open < max) {
            str.append('(');
            backtrack(ans, str, open + 1, close, max);
            str.delete(str.length() - 1, str.length());
        }
        if (close < open) {
            str.append(')');
            backtrack(ans, str, open, close + 1, max);
            str.delete(str.length() - 1, str.length());
        }
    }

}