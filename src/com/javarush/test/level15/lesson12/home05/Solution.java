package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    private Solution(int i){}
    private Solution(short s){}
    private Solution(float f){}
    protected Solution(String s){}
    protected Solution(char c){}
    protected Solution(byte b){}
    public Solution(){}
    public Solution(double d){}
    public Solution(Object o){}
    Solution(Integer i){}
    Solution(Double d){}
    Solution(Character c){}
}

