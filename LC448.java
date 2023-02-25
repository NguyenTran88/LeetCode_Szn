import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LC448
 */
public class LC448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // [4,3,2,7,8,2,3,1]
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int integer : nums) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
            if (mapElement.getValue() == 0) {
                res.add(mapElement.getKey());
            }
        }

        return res;

    }

}