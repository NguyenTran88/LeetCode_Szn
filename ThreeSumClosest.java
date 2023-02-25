import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int mindiff = Integer.MAX_VALUE; // target - closest sum
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            // [-1,2,1,-4]
            while (left < right) {
                int curr = nums[i] + nums[left] + nums[right];
                int curdif = Math.abs(target - curr);
                mindiff = Math.min(mindiff, curdif); // we can't do this since we need to save curr
                if (curr < target) {
                    left++;
                } else if (curr > target) {
                    right--;
                } else {
                    return curr;
                }

            }

        }
        return target - mindiff;
    }
}
