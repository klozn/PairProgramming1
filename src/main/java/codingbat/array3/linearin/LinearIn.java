package main.java.codingbat.array3.linearin;

public class LinearIn {

    public boolean linearIn(int[] outer, int[] inner) {
        if (outer == null || inner == null) {
            return false;
        }
        int outerSize = outer.length;
        int innerSize = inner.length;
        if (outerSize < innerSize) {
            return false;
        }
        int amountFound = 0;
        for (int innerNumber : inner) {
            if (outerContains(innerNumber, outer)) {
                amountFound++;
            }
        }
        return amountFound == innerSize;
    }

    public static boolean outerContains(int number, int[] outer) {
        for (int outerNumber : outer) {
            if (number == outerNumber) {
                return true;
            }
        }
        return false;
    }

}
