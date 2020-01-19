package tech.barny.sda.programowanie1;

public class Zadanie2 {
    public int[] reverseTab(int[] arr) {
        int[] arr2 = new int[arr.length];
        if (arr.length%2!=0) {
            arr2[arr.length-1]=arr[arr.length-1];
        }
        {
            for (int x=0; x<arr.length-1;x++){
                if (x%2!=0){
                    arr2[x]=arr[x-1];
                }else arr2[x]=arr[x+1];
            }}
        return arr2;
    }

}
