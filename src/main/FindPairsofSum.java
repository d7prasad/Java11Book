package main;

import java.util.HashSet;
import java.util.Set;

public class FindPairsofSum {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        Set set = new HashSet(numbers.length);
        int n = 6;
        for (int value: numbers){
            int target = n - value;
            if(set.contains(target)){
                set.add(target);
            }else{
                System.out.printf("Total Sum (%d, %d) ", value, target);
            }
        }
    }
}
