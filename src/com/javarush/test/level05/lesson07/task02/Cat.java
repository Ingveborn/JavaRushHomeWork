package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    private String name;
    private int weight;
    private int age;
    private String addres;
    private String colour;

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.weight = 60;
        this.age = age;
    }

    public void initialize(int weight, String colour)
    {
        this.weight = weight;
        this.colour = colour;
        this.name = null;
        this.addres = null;
        this.age = 4;
    }

    public void initialize(int weight, String addres, String colour)
    {
        this.weight = weight;
        this.addres = addres;
        this.colour = colour;
        this.age = 4;
        this.name = null;
    }
}
