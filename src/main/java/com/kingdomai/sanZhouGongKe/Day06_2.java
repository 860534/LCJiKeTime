package com.kingdomai.sanZhouGongKe;

public class Day06_2 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
//        System.out.println(ransomNote.charAt(0) - 'a');
//        System.out.println(magazine.charAt(0) - 'a');
        System.out.println(canConstruct(ransomNote,magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            count[ransomNote.charAt(i) - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] < 0){
                return false;
            }
        }
        return true;
    }
}
