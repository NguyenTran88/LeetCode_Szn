/**
 * LC713SubarrProduct
 */
public class LC713SubarrProduct {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // nums = [10,5,2,6], k = 100
        int left = 0;
        int right = 0;
        int count = 0;
        int product = 1;
        if (k <= 1) {
            return 0; // if don't want this, must change condition
        }
        while (right < nums.length) {
            product *= nums[right];
            while (product >= k) { // while (left <= right && product >= k) since there are times when
                // k < every element => we push left more than we move right => left > right
                product /= nums[left++];
            }
            count += right - left + 1;

            right++;
        }
        return count;
    }
}