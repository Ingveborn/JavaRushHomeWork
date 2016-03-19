package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = new FileWriter(reader.readLine());

        String data = reader.readLine();
        ArrayList<String> dataList = new ArrayList<String>();

        while (true){
        if (data.equals("exit")) {
            dataList.add(data);
            break;
        }
            dataList.add(data);
            data = reader.readLine();
        }
        for (String s : dataList){
            fileWriter.write(s+"\r\n");
        }
        fileWriter.close();
    }
}
