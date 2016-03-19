package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] numbers = new int[5];
        int[] numbers2 = new int[2];
        int[] numbers3 = new int[4];
        int[] numbers4 = new int[7];
        int[] numbers5 = new int[0];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }
        for (int i = 0; i < numbers2.length; i++){
            numbers2[i] = i;
        }
        for (int i = 0; i < numbers3.length; i++){
            numbers3[i] = i;
        }
        for (int i = 0; i < numbers4.length; i++){
            numbers4[i] = i;
        }
        list.add(numbers);
        list.add(numbers2);
        list.add(numbers3);
        list.add(numbers4);
        list.add(numbers5);

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
