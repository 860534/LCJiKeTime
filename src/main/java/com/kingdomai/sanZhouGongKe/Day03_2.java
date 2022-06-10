package com.kingdomai.sanZhouGongKe;

public class Day03_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{7,3,13,1,5,3,9,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
//        int minprice = Integer.MAX_VALUE;
//        int maxprofit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if(prices[i] < minprice){
//                minprice = prices[i];
//            }else if(prices[i] - minprice > maxprofit){
//                maxprofit = prices[i] - minprice;
//            }
//        }
//        return maxprofit;

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
