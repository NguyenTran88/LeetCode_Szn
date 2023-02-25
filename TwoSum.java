import java.util.*;

/**
 * TwoSum
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] kq = new int[2];

        int[] arr = new int[nums.length];
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            myMap.put(nums[index], index);

        }
        for (int i = 0; i < nums.length; i++) {
            arr[i] = target - nums[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (myMap.containsKey(arr[i]) && myMap.get(arr[i]) != i) {
                // we added every element of nums to map, so if mymap contains arr[i] => arr[i]
                // also exists in nums
                // and nums and arr[i] complement each other => there are two number that sums
                // to target in nums
                kq[0] = myMap.get(arr[i]);
                kq[1] = i;
                break;
            }

        }
        return kq;
    }
}