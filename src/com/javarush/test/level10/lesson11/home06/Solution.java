package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        public String firstName;
        public String lastName;
        public int age;
        public boolean sex;
        public Human Father;
        public Human Mother;

        public Human(){

        }
        public Human(String firstName){
            this.firstName = firstName;
        }
        public Human(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public Human(String firstName, boolean sex){
            this.firstName = firstName;
            this.sex = sex;
        }
        public Human(String firstName, String lastName, boolean sex){
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
        }
        public Human(String firstName, int age){
            this.firstName = firstName;
            this.age = age;
        }
        public Human(String firstName, String lastName, boolean sex, int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
        }
        public Human(String firstName, String lastName, int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
        public Human(String firstName, String lastName, Human Father, Human Mother){
            this.firstName = firstName;
            this.lastName = lastName;
            this.Father = Father;
            this.Mother = Mother;
        }
        public Human(String firstName, String lastName, int age, boolean sex, Human Father, Human Mother){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.Father = Father;
            this.Mother = Mother;
        }
    }
}
