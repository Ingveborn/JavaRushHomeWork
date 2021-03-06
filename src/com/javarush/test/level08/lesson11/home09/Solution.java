package com.javarush.test.level08.lesson11.home09;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws ParseException
    {
    }

    public static boolean isDateOdd(String date) throws ParseException
    {
        Date yearStart = new Date();
        yearStart.setHours(0);
        yearStart.setMinutes(0);
        yearStart.setSeconds(0);
        yearStart.setDate(1);
        yearStart.setMonth(0);

        DateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date newDate = format.parse(date);
        long msDif = newDate.getTime() - yearStart.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msDif/msDay);

        if (dayCount % 2 == 0)
            return true;
        else
            return false;
    }
}
