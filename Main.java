import java.util.HashSet;

public class Main {

    public static void main(String [] args) {

        String a = "abcabcbb";
        int res1 = lengthOfLongestSubstring(a);
        assert res1 == 3;

        String b = "bbbbb";
        int res2 = lengthOfLongestSubstring(b);
        assert res2 == 1;

        String c = "pwwkew";
        int res3 = lengthOfLongestSubstring(c);
        assert res3 == 3;

    }

    static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int count = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);

            count = Math.max(count, set.size());
        }

        return count;
    }


}
