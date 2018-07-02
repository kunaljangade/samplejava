package strings;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str1 = "my first code";
        String str2 = "my my";

        System.out.println(uniqueChars(str1));
    }

    public static boolean uniqueChars(String str) {
        int checker = 0, bitAtIndex;

        for (int i = 0; i < str.length(); i++) {
            bitAtIndex = str.charAt(i) - 'a';

            if ((checker & (1 << bitAtIndex)) > 0)
                return false;

            checker = checker | (1 << bitAtIndex);
        }

        return true;
    }
}
