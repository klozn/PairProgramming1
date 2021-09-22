package main.java.codingbat.functional2.noteen;

import java.util.ArrayList;
import java.util.List;

public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num < 13 || num > 19) {
                result.add(num);
            }
        }
        return result;
    }
}
