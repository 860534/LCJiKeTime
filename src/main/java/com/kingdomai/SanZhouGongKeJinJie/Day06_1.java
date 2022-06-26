package com.kingdomai.SanZhouGongKeJinJie;

public class Day06_1 {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        String s = addStrings(num1, num2);
        System.out.println(s);
    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;
        StringBuffer stringBuffer = new StringBuffer();
        while ((i >= 0) || (j >= 0) || (add != 0)){
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0': 0;
            int result = x + y + add;
            stringBuffer.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        stringBuffer.reverse();
        return stringBuffer.toString();
    }

}
