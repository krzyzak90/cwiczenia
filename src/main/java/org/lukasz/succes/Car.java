package org.lukasz.succes;

public class Car {

    String model;
    String type;
    String color;
    String engine;
    int agecar;
    int petrocar;

    public Car(String model, String type, String color, String engine, int agecar, int petrocar) {
        this.model = model;
        this.type = type;
        this.color = color;
        this.engine = engine;
        this.agecar = agecar;
        this.petrocar = petrocar;
    }


    public String getInfocar() {
        String infocar;
        infocar = "Model auta to " + model
                + "\n Jest to "
                + type + "\n W kolorze "
                + color + "\n silnik :" + engine
                + "\n wiek :" + agecar
                + "\n Ilosc paliwa w baku:" + petrocar;
        System.out.println(infocar);

        return infocar;
    }

}

