package com.kingdomai.SanZhouGongKeJinJie;

import java.nio.charset.Charset;
import java.util.HashMap;

public class Day07_1 {

    public static void main(String[] args) {
        String pattren = "abba";
        String s = "dog dog dog dog";
        boolean b = wordPattern(pattren, s);
        System.out.println(b);
    }

    public static boolean wordPattern(String pattern, String s) {
        //char[] chars = pattern.toCharArray();
        String[] s1 = s.split(" ");
        if (pattern.length() != s1.length){
            return false;
        }
        HashMap<Object,Integer> map = new HashMap<>();
        //String put1 = map.put('1', "111");
        //String put2 = map.put('1', "111");
        //
        //System.out.println(put1);

        for (int i = 0; i < pattern.length(); i++) {
            if (map.put(pattern.charAt(i), i) != map.put(s1[i], i)) {
                return false;
            }
            //if (map.containsKey(chars[i])){
            //    if (!s1[i].equals(map.get(chars[i]))){
            //        return false;
            //    }
            //} else {
            //    String put = map.put(chars[i], s1[i]);
            //}
        }
        return true;
    }
}
