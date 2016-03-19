package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] arrayOfStringList = new ArrayList[3];
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("lalka");
        stringList.add("lalka");
        stringList.add("lalka");
        ArrayList<String> stringList2 = new ArrayList<String>();
        stringList2.add("lalka2");
        stringList2.add("lalka2");
        stringList2.add("lalka2");
        stringList2.add("lalka2");
        ArrayList<String> stringList3 = new ArrayList<String>();
        stringList3.add("lalka3");
        stringList3.add("lalka3");
        stringList3.add("lalka3");
        stringList3.add("lalka3");
        stringList3.add("lalka3");
        arrayOfStringList[0] = stringList;
        arrayOfStringList[1] = stringList2;
        arrayOfStringList[2] = stringList3;

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}