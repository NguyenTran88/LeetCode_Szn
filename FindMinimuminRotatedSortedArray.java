/**
 * FindMinimuminRotatedSortedArray
 */ // 5 6 7 8 0 1 2 3
// 8 1 2 3 5 6 7 1 2 3 4 5 6 7
public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }

}