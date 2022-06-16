package com.kingdomai.sanZhouGongKe;

import java.util.Arrays;

public class Day06_3 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.equals(chars, chars1);

//        if(s.length() != t.length()){
//            return false;
//        }
//        int[] count = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            count[s.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < t.length(); i++) {
//            count[t.charAt(i) - 'a']--;
//        }
//        for (int i = 0; i < count.length; i++) {
//            if (count[i] != 0){
//                return false;
//            }
//        }
//        return true;
    }
}
