package com.kingdomai.OdWork;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day03_1 {

    public static void main(String[] args) {

        Map<String, String> timeCodeMap = new HashMap<>();
        LocalDate currentDate = LocalDate.now(); // 当前日期
        int currentYear = currentDate.getYear(); // 当前年份
        Month currentMonth = Month.DECEMBER;
        //int currentYear = currentDate.getYear(); // 当前年份
        //Month currentMonth = currentDate.getMonth(); // 当前月份
        int previousYear = currentYear - 1; // 上一年的年份

        //上一个月度期别
        YearMonth previousMonthYearMonth = YearMonth.of(currentYear, currentMonth).minusMonths(1); // 上个月的年月
        timeCodeMap.put("1", previousMonthYearMonth.getYear() + "" + String.format("%02d", previousMonthYearMonth.getMonthValue()));

        //上一个季度期别
        int previousQuarter;
        if (currentMonth.getValue() >= 1 && currentMonth.getValue() <= 3) {
            // 当前月份在第一季度
            previousQuarter = 4;
        } else {
            previousQuarter = (currentMonth.getValue() - 2) / 3;
        }
        if (4 != previousQuarter) {
            timeCodeMap.put("2", currentYear + "" +  String.format("%02d", previousQuarter * 3 ));
        } else {
            timeCodeMap.put("2", previousYear + "" + "12");
        }

        //上一个年度期别
        timeCodeMap.put("3", previousYear + "" + "12");

        for (String s : timeCodeMap.keySet()) {
            System.out.println(s+ "  " + timeCodeMap.get(s));

        }

        //Map<String, String> timeCodeMap = new HashMap<>();
        //LocalDate currentDate = LocalDate.now(); // 当前日期
        //int currentYear = currentDate.getYear(); // 当前年份
        ////Month currentMonth = Month.JANUARY; // 当前月份
        //Month currentMonth = currentDate.getMonth(); // 当前月份
        //int currentMonthValue = currentDate.getMonthValue(); // 当前月份
        //int previousYear = currentYear - 1; // 上一年的年份
        //
        ////上一个季度
        //int previousQuarter;
        //if (currentMonth.getValue() >= 1 && currentMonth.getValue() <= 3) {
        //    // 当前月份在第一季度
        //    previousQuarter = 4;
        //} else {
        //    previousQuarter = (currentMonth.getValue() - 2) / 3;
        //}
        //if (4 != previousQuarter) {
        //    timeCodeMap.put("Quarter", currentYear + "" +  String.format("%02d", previousQuarter * 3 ));
        //    System.out.println(currentYear + "" +  String.format("%02d", previousQuarter * 3 ));
        //} else {
        //    timeCodeMap.put("Quarter", previousYear + "" + "12");
        //    System.out.println(previousYear + "" + "12");
        //}
        //
        //
        //
        //YearMonth previousMonthYearMonth = YearMonth.of(currentYear, currentMonth).minusMonths(1); // 上个月的年月
        //int previousMonthYear = previousMonthYearMonth.getYear(); // 上个月的年份
        //int monthValue = previousMonthYearMonth.getMonthValue();
        //System.out.println(previousMonthYear);
        //System.out.println(String.format("%02d", monthValue));
        //
        //Month previousMonth = previousMonthYearMonth.getMonth(); // 上个月的月份


        //System.out.println("当前月份是 " + currentMonth);
        //System.out.println("上一年的年份是 " + previousYear);
        //System.out.println("上一个季度是第 " + previousQuarter + " 季度");
        //System.out.println("上个月的年份是 " + previousMonthYear);
        //System.out.println("上个月的月份是 " + previousMonth);
        //System.out.println("上个月的年月是 " + previousMonthYearMonth);

        //YearMonth currentYearMonth = YearMonth.of(2023, Month.JANUARY); // 当前年月
        //YearMonth previousQuarterYearMonth = currentYearMonth.minusMonths(3); // 上一个季度的年月
        //
        //int previousYear = previousQuarterYearMonth.getYear(); // 上一个季度的年份
        //int previousQuarter = (previousQuarterYearMonth.getMonthValue() - 1) / 3 + 1; // 上一个季度的季度数
        //
        //System.out.println("上一个季度是第 " + previousQuarter + " 季度");
        //System.out.println("上一个季度的年份是 " + previousYear);

        //Calendar calendar = Calendar.getInstance();
        //int currentMonth = calendar.get(Calendar.MONTH);
        //
        //int previousQuarter;
        //
        //if (currentMonth >= 0 && currentMonth <= 2) {
        //    // 当前月份是第一季度
        //    previousQuarter = 4;
        //} else if (currentMonth >= 3 && currentMonth <= 5) {
        //    // 当前月份是第二季度
        //    previousQuarter = 1;
        //} else if (currentMonth >= 6 && currentMonth <= 8) {
        //    // 当前月份是第三季度
        //    previousQuarter = 2;
        //} else {
        //    // 当前月份是第四季度
        //    previousQuarter = 3;
        //}
        //
        //System.out.println("上一个季度是第 " + previousQuarter + " 季度");


    }

    public static boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }

        return set.size() <= 1;

    }
}
