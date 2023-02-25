public class LC153 {
    public static int findMin(int[] nums) {
        // [4,5,6,7,0,1,2]
        int n = nums.length;
        if (nums[0] < nums[n - 1]) {
            return nums[0];
        }
        // int min = Integer.MAX_VALUE;
        int low = 0, high = n - 1;
        int mid = 0;
        // int res = min;
        while (low <= high) {
            mid = high - (high - low) / 2;
            // 4,5,1,2
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
            if (low == high) {
                return nums[low];
            }
            // res = Integer.min(res, nums[mid]); // don't need this

        }
        return nums[0]; // dead ass can return whatever here, in most examples
        // it would be nums[low] but we have line 20 so we good
        // return min; why would you return min ? that shit an index

    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        System.out.println(findMin(arr));

    }

}
