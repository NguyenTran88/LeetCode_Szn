public class LC1574 {
    public int findLengthOfShortestSubarray(int[] arr) {
        // [1,2,3,10,4,2,3,5]
        int n = arr.length - 1;
        int i = 0, j = n;

        while (i < n && arr[i] <= arr[i + 1]) { // if we switch this order => fail
            i++;
        }
        if (i == arr.length - 1) {
            return 0;
        }

        while (arr[j] >= arr[j - 1] && j > i) {
            // if j = i => ngay tu dau day da la increasing arr => would have
            // returned thru if statement above
            j--;
        }

        // figure out min length for the array IF we don't merge
        int min_len = Math.min(j, n - i);
        int k = i;
        i = 0;

        // we got 2 sorted array: 1,2,3,10 and 2,3,5. let's merge
        // consider 1, we can merge with 2,3,5. If that's work, let's try to include 2
        // => 1,2 and 2,3,5

        while (i <= k && j <= arr.length - 1) { // Pay attention: j <= arr.length -1
            if (arr[i] <= arr[j]) { // if(1 < 2 of 2,3,5)
                min_len = Math.min(min_len, j - i - 1); // i-j-1
                i++; // let's move i to 2 of 1,2. Now we ll see if we can merge that with 2,3,5

            } else {
                j++;
                // if even the first element (smallest) of the left subarr is larger than
                // arr[j], no way we can merge it
                // we have to increase j
            }

        }

        return min_len;

    }

}
