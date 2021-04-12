package com.xzh.solution;

/**
 * @author 向振华
 * @date 2021/04/12 16:34
 */
public class 无重复字符的最长子串 {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int maxLen = 0;
        String max = "";
        for (int i = 0; i < s.length(); i++) {
            if (!max.contains(String.valueOf(s.charAt(i)))) {
                max += s.charAt(i);
            } else {
                max = max.substring(max.indexOf(s.charAt(i)) + 1) + s.charAt(i);
            }
            if (max.length() > maxLen) {
                maxLen = max.length();
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbvaklf"));
    }
}
