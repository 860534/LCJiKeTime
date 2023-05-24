package com.kingdomai.OdWork;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.beans.Expression;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Round {

    public static void main(String[] args) {
        String formula1 = "3 + 2 / 0.5 - 5";
        String formula2 = "4 / (7 - 5)";

        System.out.println(hasDivisionByZero(formula1)); // 输出: true
        System.out.println(hasDivisionByZero(formula2)); // 输出: false
    }

    public static boolean hasDivisionByZero(String formula) {
        String pattern = "/\\s*0"; // 匹配除号后面紧跟的零
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(formula);
        return matcher.find();
    }

    public static ArrayList<String> extractRoundStrings(String s) {
        ArrayList<String> roundStrings = new ArrayList<String>();
        Pattern pattern = Pattern.compile("round\\(\\s*[^,]+,\\s*\\d+\\.\\d+\\)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            roundStrings.add(matcher.group());
        }
        return roundStrings;
    }


}
