public class DutchNational {
    public void sortColors(int[] nums) {
        // nums = [2,0,2,1,1,0]
        int left = 0, right = nums.length - 1, mid = 0;
        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, left++, mid++); // ++
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, right--, mid);
            }
        }

    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
