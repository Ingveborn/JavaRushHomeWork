package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human kid1 = new Human("Ksenija", false, 15, new ArrayList<Human>());
        Human kid2 = new Human("Konstantin", true, 13, new ArrayList<Human>());
        Human kid3 = new Human("Vladimir", true, 13, new ArrayList<Human>());

        ArrayList<Human> children = new ArrayList<Human>();
        children.add(kid1);
        children.add(kid2);
        children.add(kid3);

        Human father = new Human("Kirill", true, 45, children);
        Human mother = new Human("Nadezda", false, 43, children);

        ArrayList<Human> fother = new ArrayList<Human>();
        fother.add(father);
        ArrayList<Human> mather = new ArrayList<Human>();
        mather.add(mother);

        Human grandfather1 = new Human("Vasilij", true, 80, fother);
        Human grandfather2 = new Human("Nikolaj", true, 78, mather);
        Human grandmother1 = new Human("Marija", false, 76, fother);
        Human grandmother2 = new Human("Natalja", false, 75, mather);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, Boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
