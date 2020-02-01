package tech.barny.sda.programowanie1;

import java.util.ArrayList;
import java.util.List;

public class Zadanie6 {
    public int[] sortuj(int[] arr){
        int [] arr2 = new int[arr.length];
        List<Integer> list = new ArrayList<>();
        for (int a=0; a<arr.length;a++){
            if (arr[a]%2!=0){
                list.add(arr[a]);
            }
            else arr2[a]=arr[a];
        } list.sort(null);
        int z=0;
        for (int a=0; a<arr.length;a++){
            if (arr2[a]==0){
                arr2[a]=list.get(z);
                z++;
            }
        }
        return arr2;
    }

}
