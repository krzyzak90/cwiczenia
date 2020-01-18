package org.lukasz.succes;

public class Person {
    String firstName;
    String lastName;
    int age;
    String sex;
    String pseudo;

    public Person (String firstName, String lastName, int age, String sex, String pseudo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.pseudo = pseudo;

    }

    public String getIntroduction() {
        String introduction;
        introduction = "Witam nazywam sie " + firstName +  " "  +  lastName + " , mam " + age + " lat " + "\n moja plec to " + sex + "\n Mowia na mnie " + pseudo;

        return introduction;
    }

    public int celebrateBirthDay(){
        age++;
        System.out.println("Happy Birthday " + firstName);
        return age;
    }

    public int getAge() {
        return age;
    }
}

