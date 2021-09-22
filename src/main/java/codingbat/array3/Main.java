package main.java.codingbat.array3;

public class Main {
    public static void main(String[] args) {
        LinearIn myLinears = new LinearIn();
        System.out.println(myLinears.linearIn(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4}));
        System.out.println(myLinears.linearIn(new int[]{1, 2, 3, 4, 5}, new int[]{5, 6}));
        System.out.println(myLinears.linearIn(new int[]{1, 2}, new int[]{2}));
        System.out.println(myLinears.linearIn(new int[]{1, 2}, new int[]{1, 2, 3}));
        System.out.println(myLinears.linearIn(new int[]{}, new int[]{1, 2, 3}));
    }
}
