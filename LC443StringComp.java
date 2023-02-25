public class LC443StringComp {
    public static int compress(char[] arr) {
        String s = "";
        int r = 0, l = 0;
        int size = 0;
        while (r < arr.length) {
            if (arr[r] != arr[l]) {
                s += size;
                l = r;
            }
            if (r == arr.length - 1 && l != r) {
                s += ++size;
            }
            size = r - l + 1;
            if (size == 1) {
                s += arr[r];
            }
            r++;
        }
        System.out.println(s);
        return s.length();

    }

    public static void main(String[] args) {
        char[] arr = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(compress(arr));

    }
}

/*
 * a,a,b,b,c,c,c
 * l
 * r
 * int size = 0; 2
 * while(r< n.length){
 * if(arr[r]!=arr[l]){
 * add size to string
 * l = r;
 * }
 * size = r - l +1;
 * if(size ==1){
 * add arr[r] into s //if they on same char
 * }
 * r++;
 * }
 */