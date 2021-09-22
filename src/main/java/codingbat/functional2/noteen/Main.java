package main.java.codingbat.functional2.noteen;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NoTeen noTeen = new NoTeen();
        System.out.println(noTeen.noTeen(List.of(12, 13, 14, 15, 10, 11, 18, 20)));
    }
}