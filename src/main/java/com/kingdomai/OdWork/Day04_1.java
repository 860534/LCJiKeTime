package com.kingdomai.OdWork;

public class Day04_1 {
    public static void main(String[] args) {
        System.out.println(oneEditAway("a", "b"));
    }

    public static boolean oneEditAway(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }

        if (first.length() == 1 && second.length() == 1) {
            return true;
        }
        int[] arr = new int[26];
        for (int i = 0; i < first.length(); i++) {
            arr[first.charAt(i) - 'a']++;
        }
        for (int i = 0; i < second.length(); i++) {
            arr[second.charAt(i) - 'a']--;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        return count <= 1;
    }
}
