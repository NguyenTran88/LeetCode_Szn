/**
 * IsPalindrome
 */
public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                str = str + Character.toLowerCase(s.charAt(i)); // remember to make it lowercase
            }
            System.out.println(str);
        }

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) { // pay attention to syntax
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}