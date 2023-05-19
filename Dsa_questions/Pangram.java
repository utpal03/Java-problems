public class Pangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }
    public static boolean checkIfPangram(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return false;
        }
        sentence = sentence.toLowerCase();
        String s = "qwertyuiopasdfghjklzxcvbnm";
        for (int i = 0; i < s.length(); i++) {
            if (!sentence.contains(s.charAt(i) + "")) {
                return false;
            }
        }
        return true;
    }
}