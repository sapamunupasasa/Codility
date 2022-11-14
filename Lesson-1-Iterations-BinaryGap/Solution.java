// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int n) {
        // write your code in Java SE 8
        int decimalNumber = n;
        int binaryTemp = 0;
        int count = 0;
        int maxCount = 0;

            while (binaryTemp == 0) {
                binaryTemp = decimalNumber%2;
                decimalNumber=decimalNumber/2;
                }

            while (decimalNumber != 0) {
                binaryTemp = decimalNumber%2;
                if (binaryTemp == 0) {
                    count++;
                }
                if (binaryTemp == 1) {
                    if (count > maxCount) {
                        maxCount = count;
                    }
                    count = 0;
                }

                decimalNumber = decimalNumber/2;


            }

            return maxCount;
    }