package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Van Dame", new Date("JULY 1 1980"));
        map.put("Arnold", new Date("AUGUST 1 1980"));
        map.put("Lundgren", new Date("SEPTEMBER 1 1980"));
        map.put("Lee", new Date("OCTOBER 1 1980"));
        map.put("Chan", new Date("NOVEMBER 1 1980"));
        map.put("Bruce", new Date("DECEMBER 1 1980"));
        map.put("Vilat", new Date("MARCH 1 1980"));
        map.put("Casper", new Date("JUNE 1 1980"));
        map.put("LoH", new Date("JULY 1 1980"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String, Date> pair = iter.next();

            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8)
                iter.remove();
        }

    }
}
