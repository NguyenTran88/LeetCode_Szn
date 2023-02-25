import java.util.HashMap;
import java.util.Map;

public class FruitBasket {
    public static int totalFruit(int[] fruits) {
        // fruits = [1,2,3,2,2]
        int maxLen = 0;
        int R = 0, L = 0;
        int n = fruits.length;
        Map<Integer, Integer> map = new HashMap<>();
        while (R < n) {
            map.put(fruits[R], map.getOrDefault(fruits[R], 0) + 1);
            while (map.size() > 2) {
                System.out.println(map.get(fruits[L]));
                System.out.println(map.get(fruits[L]) - 1);

                // 0 1 2 2
                map.put(fruits[L], map.get(fruits[L]) - 1);
                if (map.get(fruits[L]) == 0) {
                    map.remove(fruits[L]);

                }
                L++;
            }
            maxLen = Math.max(maxLen, R - L + 1);
            R++;

        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] fruits = { 0, 1, 2, 2 };
        System.out.println(totalFruit(fruits));
    }
}
