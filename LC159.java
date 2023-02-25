import java.util.HashMap;
import java.util.Map;

/**
 * LC159
 */
public class LC159 {
    public int largestSubarray2(String s) {
        int mLen = 0;
        char[] arr = s.toCharArray();
        int R = 0, L = 0;
        int n = s.length();
        // eceba
        Map<Character, Integer> map = new HashMap<>();
        while (R < n) {
            map.put(arr[R], map.getOrDefault(arr[R], 0) + 1);
            while (map.size() > 2) {
                map.put(arr[L], map.get(arr[L]) - 1);
                if (map.get(arr[L]) == 0) {
                    map.remove(arr[L]);
                    L++;
                }
            }
            mLen = Math.max(mLen, R - L + 1);
            R++;
        }

        return mLen;
    }

}