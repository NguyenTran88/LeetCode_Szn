/**
 * LC152
 */
public class LC152 {
    public static int maxProduct(int[] nums) {
        int max = 1, min = 1, res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) { // i =1
            if (nums[i] < 0) {
                int temp = max;
                max = min; // swap, maybe min is still > 0, max <0 after this swap, but since
                min = temp; // you multiply min (>0) with a negative => you get sth <0
            }
            // int temp = max; no need
            max = Math.max(max * nums[i], nums[i]); // what if array is -1 and 8 => we take 8 => nums[i]
            min = Math.min(min * nums[i], nums[i]); // what if array is -1 and -8 => we take -8
            res = Math.max(max, res); // pay attention
        }
        // 2,3,-2,4 3,0,-4,2,-3 => line 14, after we get to num[1], can see that it
        // compares -4,0
        // keep 0 and will only move on when it comes to a positive value, res will save
        // the max value we had
        // before we meet the 0
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };
        System.out.println(maxProduct(arr));
    }
}