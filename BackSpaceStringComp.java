import java.util.Stack;

public class BackSpaceStringComp {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stac1 = new Stack<>();
        // s = "ab#c", t = "ad#c"
        Stack<Character> stac2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == '#')) {
                stac1.add(s.charAt(i));
            } else {
                if (!stac1.isEmpty()) {
                    stac1.pop();
                }
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (!(t.charAt(i) == '#')) {
                stac2.add(t.charAt(i));
            } else {
                if (!stac2.isEmpty()) {
                    stac2.pop();
                }
            }
        }

        if (stac1.size() != stac2.size()) {
            return false;
        }

        while (!stac1.isEmpty()) {
            if (stac1.pop() != stac2.pop()) {
                return false;
            }
        }

        return true;

    }

}
