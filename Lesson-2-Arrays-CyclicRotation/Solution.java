// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] a, int k) {
        // write your code in Java SE 8
        int[] tempArray = new int[a.length];
        int count =1;

        while (count <= k ) {
            for (int i=0 ; i<a.length ; i++ ) {
                if (i == a.length-1) {
                    tempArray[0] = a[i];
                }
                else {
                    tempArray[i+1] = a[i];
                }
            }
            for (int i = 0; i<a.length ; i++) {
                a[i] = tempArray[i];
            }
            count++;
        }
        return a;
    }
}