package com.liumeng.gaobo.java2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by liumeng on 2020/12/21 0021.
 * Describe:
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "a");
        hashMap.put("2", "b");
        hashMap.put("3", "c");
        hashMap.put("4", "d");
        for (Map.Entry<String, String> stringStringEntry : hashMap.entrySet()) {
            System.out.println(stringStringEntry.getKey()+stringStringEntry.getValue());
        }
        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+next.getValue());
        }
        System.out.println(MapParmToString(hashMap));
    }

    /**
     * 拼接
     *
     * @param parm
     * @return
     */
    private static String MapParmToString(Map<String, String> parm) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Map.Entry<String, String>> iterator = parm.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            stringBuilder.append(entry.getKey() + "=" + entry.getValue() + "&");
        }
        String str = stringBuilder.toString().substring(0, stringBuilder.length());
        return str;
    }
}
