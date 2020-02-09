package binarne;

public class Sortowanie {
    public static boolean jestPosortowane (int[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {
            if (arr[k] > arr[k + 1]) {
                return false;
            }
        }
        return true;

    }

}
