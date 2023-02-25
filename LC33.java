public class LC33 {
    public static int search(int[] nums, int target) {
        // [4,5,6,7,0,1,2], target = 0 => output 4
        // 0,1,2,4,5,6,7
        int low = 0, high = nums.length - 1;
        while (low < high) { // don't want to deal with the = case => 3 if statement below
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] == target) {
                return low;
            }
            if (nums[high] == target) {
                return high;
            }
            // we on the left side
            if (nums[low] <= nums[mid]) {
                if (target > nums[mid] || target < nums[low]) {
                    low = mid + 1;
                } else if (target < nums[mid]) { // implicitly means target >= nums[low], stuck in between
                    high = mid - 1;
                }
            } else {
                if (target > nums[low] || target < nums[mid]) {
                    high = mid - 1;
                } else if (target > nums[mid]) {

                    low = mid + 1;
                }
            }
        }
        return nums[low] == target ? low : -1;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(search(arr, 6));

    }

}
