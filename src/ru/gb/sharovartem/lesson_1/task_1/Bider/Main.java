package ru.gb.sharovartem.lesson_1.task_1.Bider;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder().lastName("Sharov").firstName("Artem").address("Moscow").age(30).gender("Male").build();
        System.out.println(person);
    }
}
