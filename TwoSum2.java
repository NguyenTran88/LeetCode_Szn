public class TwoSum2 {
    // [2,7,11,15], target = 9
    public int[] twoSum(int[] numbers, int target) {
        int left, right, mid = -1;
        int[] kq = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int i2 = target - numbers[i];
            left = 0;
            right = numbers.length - 1;

            while (left <= right) {

                mid = (left + right) / 2;
                if (numbers[mid] < i2) {
                    left = mid + 1;

                } else if (numbers[mid] > i2) {
                    right = mid - 1;

                } else if (numbers[mid] == i2) {

                    if (mid != i) {
                        kq[1] = mid + 1;
                        kq[0] = i + 1;
                        return kq;
                    } else { // in the case {1,4,4,5} and we look for 8, => at first 4 we will land at
                        // nums[mid] == that first 4 => look to the left and the right, if not see
                        // anything
                        // that means, we aint finding a match for i here => i++ using break
                        if (numbers[mid + 1] == i2) {
                            kq[1] = mid + 2;
                            kq[0] = i + 1;
                            return kq;
                        }
                        if (numbers[mid - 1] == i2) {
                            kq[1] = mid;
                            kq[0] = i + 1;
                            return kq;
                        } else {
                            break; // no match, i++
                        }
                    }

                }
            }
        }
        return kq;
    }

}
