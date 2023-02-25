public class LC643 {
    public double findMaxAverage(int[] nums, int k) {
        // nums = [1,12,-5,-6,50,3], k = 4
        if (nums.length < k) {
            return -1.0;
        }
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            avg = sum / k;
        }

        // done with get sum
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            avg = Math.max(avg, sum / k);
        }

        return avg;
    }

}
