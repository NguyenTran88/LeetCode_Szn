import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // remember to sort
        // [-1,0,1,2,-1,-4]
        // => -6, -2, 2,3,4
        // -4,-1,-1,0,1,2,
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            int sum = 0 - nums[i];
            if (nums[i] > 0) { // => nums[right] > nums[left]> nums[i] > 0 => their sum > 0
                break;
            }
            while (left < right) {
                if (nums[left] + nums[right] < sum) {
                    left++;
                    // we don't have to check if the next left is dup bc if it is, left will move
                    // again
                } else if (nums[left] + nums[right] > sum) {
                    right--;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        // make sure we at the last duplicates after this while loop end
                        left++;
                    }
                    left++; // even if it ends, we ll move to next one => the distinct value
                    while (right > left && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    right--;

                }

            }

        }
        return ans;

    }

}
// fixed at 1 element, after that it becomes 2 sum
// pointer like in 2 sum 2: we tryna get left pointr + right = target, let's
// keep left ptr at 1 place
// => only have 1 options left for the right, and we keep moving the right to
// adjust the sum
// why is left set at i+1 and not 0 ? becasue lets say i = 1, we r looking for
// remaining 2 element
// if we look at sth to the left of i and find -1 and 0, that' duplicates (since
// this result is already
// found when we looked at -1 and find 0 and find 1
// => -6, -2, 2,3,4
