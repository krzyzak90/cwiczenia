package org.lukasz.succes;

import java.util.Arrays;

public class WeekDayExample {
    public static void main(String[] args) {
        WeekDay currentWeekDay = getCurrentWeekDay();
        System.out.println(currentWeekDay.ordinal());
        System.out.println(currentWeekDay.name());

        WeekDay monday = WeekDay.valueOf("MONDAY");
        System.out.println(monday.ordinal());
        System.out.println(monday.name());

        WeekDay[] values = WeekDay.values();
        System.out.println(Arrays.toString(values));

    }

    private static WeekDay getCurrentWeekDay() {
        return WeekDay.SUNDAY;
    }
}
