package tech.barny.sda.programowanie1;

import java.util.ArrayList;
import java.util.List;

public class Zadanie4 {

    public int[] averageTab(int[] arr){
        int avg=0;
        for (int i = 0; i < arr.length; i++) {
            avg+=arr[i];
        }
        double avg1 = avg/arr.length;
        List<Integer> list = new ArrayList<>();
        for (int x=0; x<arr.length; x++){
            if (arr[x]>=avg1){
                list.add(arr[x]);
            }
        }
        int[] arr2 = new int[list.size()];
        for (int x=0; x<list.size();x++){
            arr2[x]=list.get(x);
        }
        return arr2;
    }

}
