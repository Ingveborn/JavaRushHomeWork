package com.javarush.test.level08.lesson08.task03;

import java.util.*;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        String name = "Pavel";
        String familiya = "Tomozov";
        map.put("Tomozov", "Pavel");
        map.put("ewtwert", "wertw");
        map.put("Tomozertov", "Pavel");
        map.put("Tomozdsgov", "Pawertvel");
        map.put("Tomewtozov", "Pabsbel");
        map.put("Tomohdsfhzov", "Pavesdfgdsfgl");
        map.put("Tomozeyaov", "Padfgsdfgvel");
        map.put("Tortwemozov", "Pasdfgsdvel");
        map.put("Toasdmozov", "Pafsdgdfgvel");
        map.put("Tomosdfhzov", "Pavsdfgsdfgel");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int nameCount = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getValue().equals(name))
                nameCount++;
        }
        return nameCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //напишите тут ваш код
        int lnameCount = 0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            if (pair.getKey().equals(familiya))
                lnameCount++;
        }
        return lnameCount;
    }
}
