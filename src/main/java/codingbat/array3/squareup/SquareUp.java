package main.java.codingbat.array3.squareup;

public class SquareUp {
    public int[] squareUp(int n){
        int[] myArray = new int[n*n];
        int counter = n;

        for(int index = myArray.length - 1; index >= 0;){
            for(int i = 1; i <= n; i++){
                if (i > counter) {
                    myArray[index--] = 0;
                } else {
                    myArray[index--] = i;
                }
            }
            counter--;
        }

        return myArray;
    }
}
