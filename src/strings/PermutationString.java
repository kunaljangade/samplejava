package strings;

import java.util.Hashtable;

public class PermutationString {
    public static void main(String[] args) {
        String str1 = "If you have a lot of these guys";
        String str2 = "If you are looking for a way to avoid";

        permutation(str1,str2);
    }

    public static void permutation(String s1, String s2){
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        Hashtable<String, Integer> map1 = new Hashtable<String, Integer>();

        int count = 1;

        for(String s: str1){
            if(!map1.containsKey(s)){
                map1.put(s,count);
            } else
                map1.put(s,count++);

        }
    }
}
