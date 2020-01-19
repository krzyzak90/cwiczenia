package tech.barny.sda.programowanie1;

import java.util.logging.Logger;

public class Zadanie1 {

    public int[]reverseTab (int [] arr) {
        int [] result = new int[arr.length];
        for (int i=0; i< arr.length; i++){
            result[i] = arr[arr.length-1-i];
        }
        return result;
    }

}
