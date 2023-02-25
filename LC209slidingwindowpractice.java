public class LC209slidingwindowpractice {
    public static int minSubArrayLen(int target, int[] nums) {
        int L = 0, R = 0;
        int min = Integer.MAX_VALUE, sum = 0;
        int n = nums.length;

        while (R < n) { // since we keeps expanding window till end => right pointer < n
            sum += nums[R];
            // add nums[R] to sum, if not big enough, add another in line 20

            while (sum >= target) { // if we get a valid sum, we try to cut its left, keep doing
                // so until it doesn't work => add a right element in (line 20)
                min = Math.min(min, R - L + 1);
                // if sum is valid, let's see if the window is small enough for new min
                sum -= nums[L];
                // since sum works, let's try to cut its left by 1 element, we will return to
                // start of
                // inner while loop to compare this new sum
                L++; // since we cut the left element, we have to move pointer to the new left
            }
            R++; // expand window to the right by adding 1 more element
        }
        return min == Integer.MAX_VALUE ? 0 : min;

    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 2, 4, 3 };
        // int nums2[] = { 1, 4, 4 };
        System.out.println(minSubArrayLen(7, nums));
    }
}
