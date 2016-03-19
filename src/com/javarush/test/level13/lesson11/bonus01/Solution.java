package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        String data = reader1.readLine();
        while(!data.equals("")){
            arrayList.add(Integer.valueOf(data));
            data = reader1.readLine();
        }
        ArrayList<Integer> even = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size(); i ++){
            if (arrayList.get(i) % 2 == 0){
                even.add(arrayList.get(i));
            }
        }
        Collections.sort(even);
        for (Integer i : even){
            System.out.println(i);
        }
    }
}
