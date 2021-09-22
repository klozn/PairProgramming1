package main.java.codingbat.array3.seriesup;

public class SeriesUp {

    public int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];

        for (int index = result.length - 1; index >= 0; ) {
            for (int i = 0; i < n; i++) {
                result[index--] = n - i;
            }
            n--;
        }
        return result;
    }
}
