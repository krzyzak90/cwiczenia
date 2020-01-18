package org.lukasz.succes;

import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Person person = getLukasz();
        System.out.println(person.getIntroduction());
        Data mojadata = new Data(1990, 7, 9);
        int miesiac = mojadata.monthsFromBirth(2019, 11);
        System.out.println("liczba miesiecy od urodzenia " + miesiac);
        person.celebrateBirthDay();
        System.out.println(person.getAge());

        Person justyna = getJustyna();
        System.out.println(justyna.getIntroduction());
        Data nynadata = new Data(1991, 1, 16);
        int miesiacc = nynadata.monthsFromBirth(2019, 11);
        System.out.println("liczba miesiecy od urodzenia " + miesiacc);
        justyna.celebrateBirthDay();
        System.out.println(justyna.getAge());

        Person leo = getLeo();
        System.out.println(leo.getIntroduction());
        Data leodata = new Data(2013, 9, 6);
        int miesiaccc = leodata.monthsFromBirth(2019, 11);
        System.out.println("liczba miesiecy od urodzenia " + miesiaccc);
        leo.celebrateBirthDay();
        System.out.println(leo.getAge());
//
//        Car audi = getAudi();
//        System.out.println(audi.getInfocar());
//Data d = new Data(1990,7,9);
//        Data f = new Data(1991,1,16);
//        System.out.println(d.monthsFromBirth(2019, 11));
//        System.out.println(f.monthsFromBirth(2019,11));





    }

    public static Person getLukasz() {
        Person person = new Person("Lukasz", "Prochon", 29, "mezczyzna", "krzyzak");
        return person;

    }

    public static Person getJustyna() {
        Person justyna = new Person("Justyna", "Prochon", 28, "kobieta", "niunia");
        return justyna;
    }

    public static Person getLeo() {
        Person leo = new Person("Leo", "Prochon", 8, "mezczyzna", "synek");
        return leo;
    }

    public static Car getAudi() {

        Car audi = new Car("audi", "sportback", "czarny", "diesel", 3, 60);
        return audi;
    }






}
