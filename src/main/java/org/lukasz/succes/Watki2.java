package org.lukasz.succes;

import java.time.LocalTime;

public class Watki2 {
    public static void main(String[] args) throws InterruptedException {
        // 1. zadanie do wykonania przez wątek
        LocalTime czas = LocalTime.now();
        Runnable zadanie = () -> {
            try {
                // każ wątkowi spać przez 5 s (5000 ms)
                Thread.sleep(5000);
                System.out.println("Wątek X: Cześć " + czas);

                // śpij jeszcez raz
                Thread.sleep(5000);
                System.out.println("Wątek X: Kończę pracę");
            } catch (InterruptedException e) {
                // zignoruj wyjątek
            }
        };
        // 2. utworzenie wątku
        Thread wątekX = new Thread(zadanie);
        // 3. uruchomienie wątku
        wątekX.start();
        // 4. sprawdź stan wątku
        Thread.State stanWątkuX = wątekX.getState();
        System.out.println("Stan wątku X: " + stanWątkuX);
        // 5. zaczekanie na zakończenie pracy wątku
        wątekX.join();
        System.out.println("Program kończy działanie...");
    }


}

