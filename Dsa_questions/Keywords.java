import java.util.*;

//https://leetcode.com/problems/keyboard-row/description/

public class Keywords {
    public static void main(String[] args) {
        String[] words = new String[] { "Hello", "Alaska", "Dad", "Peace" };
        System.out.println(Arrays.asList(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        String Row1 = "qwertyuiop";
        String Row2 = "asdfghjkl";
        String Row3 = "zxcvbnm";

        for (int j = 0; j < words.length; j++) {
            String s = words[j];
            String str = s.toLowerCase();
            if (Row1.contains(str.charAt(0) + "")) {
                if (isContain(str, Row1)) {
                    ans.add(s);
                }
            }
            if (Row2.contains(str.charAt(0) + "")) {
                if (isContain(str, Row2)) {
                    ans.add(s);
                }
            }
            if (Row3.contains(str.charAt(0) + "")) {
                if (isContain(str, Row3)) {
                    ans.add(s);
                }
            }
        }
        return ans.toArray(new String[ans.size()]);
    }

    public static boolean isContain(String word, String row) {
        for (int i = 0; i < word.length(); i++) {
            if (!row.contains(word.charAt(i) + "")) {
                return false;
            }
        }
        return true;
    }
}
