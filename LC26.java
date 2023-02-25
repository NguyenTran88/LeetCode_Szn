//import java.util.HashSet;
//import java.util.Set;

public class LC26 {
    public int removeDuplicates(int[] nums) {
        // [0,0,1,1,1,2,2,3,3,4]
        int[] wev = new int[nums.length];
        int i = 0, k = 0;
        while (i < nums.length) {
            int j = i + 1;
            wev[k++] = nums[i];
            while (i < nums.length - 1 && nums[i] == nums[j]) {
                j++;
            }
            i = j;
        }
        for (int j = 0; j < wev.length; j++) {
            nums[i] = wev[i];
        }
        return nums.length;

    }

    /*
     * Set<Integer> set = new HashSet<>();
     * for (int i = 0; i < nums.length; i++) {
     * set.add(nums[i]);
     * }
     * int k = set.size();
     * int i=0;
     * for (Integer integer : set) {
     * nums[i++]=integer;
     * }
     * 
     * return k;
     */
}
