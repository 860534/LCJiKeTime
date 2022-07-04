package com.kingdomai.SuiBiTest;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class SuiBiTest {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(getArrayListCapacity(arrayList));
        System.out.println(arrayList.size());

        arrayList.add(1);
        for (int i = 0; i < 11; i++) {
            arrayList.add(2);
        }
        System.out.println(getArrayListCapacity(arrayList));
        System.out.println(arrayList.size());

    }

    public static int getArrayListCapacity(ArrayList arrayList){
        Class<ArrayList> arrayListClass = ArrayList.class;
        try {
            Field field = arrayListClass.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] objects = (Object[]) field.get(arrayList);
            return objects.length;
        } catch (Exception e){
            e.printStackTrace();
            return -1;
        }


    }
}
