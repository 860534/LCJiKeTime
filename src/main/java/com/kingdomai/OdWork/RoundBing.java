package com.kingdomai.OdWork;

import java.util.Stack;

public class RoundBing {

    public static void main(String[] args) {
        String s = "round(( COM0- COM1) / COM2 * 100,3) + round(( COM3- COM4) / COM5 * 100,3)";
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
                sb.append(c);
            } else if (c == ')') {
                stack.pop();
                sb.append(c);
            } else {
                sb.append(c);
            }
        }
        int leftIndex = sb.indexOf("(");
        int rightIndex = sb.lastIndexOf(")");
        String result = sb.toString();
        result = String.format("%.3f", Double.parseDouble(result));
        System.out.println("round后的结果为：" + result);
        System.out.println("左括号位置为：" + leftIndex + "，右括号位置为：" + rightIndex);
    }

}
