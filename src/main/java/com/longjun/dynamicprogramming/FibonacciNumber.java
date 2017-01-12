package com.longjun.dynamicprogramming;

public class FibonacciNumber {

    /**
     * recursive solution, easy to understand but not efficient.
     *
     * @param n
     * @return
     */
    public int calculate(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return calculate(n - 1) + calculate(n - 2);
    }


}
