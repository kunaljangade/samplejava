package strings;

public class ReverseString {
    public static void main(String[] args) {
        String str1 = "1gnirts";
        String str2 = "mmuy";

        System.out.println(reverseString(str1));
    }

    public static String reverseString(String str) {

        char[] chars = str.toCharArray();
        int i, j = str.length() - 1;
        char temp;

        for (i = 0; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return String.copyValueOf(chars);
    }
}
