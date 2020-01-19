package org.lukasz.succes;

import java.time.LocalDateTime;

public class ZadanieWatki {
    public static void main(String[] args) throws InterruptedException {
        //program który co po 5 sekund pisze jaka godzina
        Runnable czasomierze = () -> {
            try {
                // każ wątkowi spać przez 5 s po 10 razy (5000 ms)
                for(int i=0; i<10;i++){
                    Thread.sleep(5000);
                    System.out.println(LocalDateTime.now().toString());
                }
            } catch (InterruptedException e) {
                // zignoruj wyjątek
            }
        };
        Thread watekCzasu = new Thread(czasomierze);
        watekCzasu.start();
        //join sprawia że wątek główny czeka na wykonanie wątku pobocznego Czasomierz
        watekCzasu.join();
        System.out.println("Program kończy działanie...");
    }

}
