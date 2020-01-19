package tech.barny.sda.programowanie1;

public class Zadanie3 {

    public int[] reverseTab(int[] arr) {
        int[] arr2 = new int[arr.length];
        arr2[arr.length - 1] = arr[arr.length - 1];
        arr2[arr.length - 2] = arr[arr.length - 2];
        {
            for (int x = 0; x < arr.length - 2; x++) {
                arr2[x] = arr[x]+arr[x+2];
            }
            return arr2;
        }
    }
}
