package com.kingdomai;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Day06_1 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(1);
    }

    public static int firstUniqChar(String s) {
        byte[] bytes = s.getBytes();
        LinkedHashMap<Byte,Integer> map = new LinkedHashMap<>(s.length());
        for (int i = 0; i < bytes.length; i++) {
            if(map.containsKey(bytes[i])){
                int count = map.get(bytes[i]);
                map.put(bytes[i],count + 1);
            }else {
                map.put(bytes[i],1);
            }
        }
        for (Byte aByte : map.keySet()) {
            if(map.get(aByte) == 1){
                return s.indexOf(aByte);
            }
        }
        return -1;
    }
}
