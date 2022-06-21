package com.kingdomai.SuiBiTest;

import java.util.ArrayList;

public class SuiBiTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Class c = null;
        try {
//            arrayList.getClass().var
            c = Class.forName("java.util.ArrayList");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
