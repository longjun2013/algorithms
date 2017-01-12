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

    /**
     * DP solution
     *
     * @param n
     * @return
     */
    public int calculateWithDP(int n) {
        int a1 = 1;
        int a2 = 1;

        if (n == 1) {
            return a1;
        }

        if (n == 2) {
            return a2;
        }

        for (int i = 3; i <= n; i++) {
            int result = a1 + a2;

            a1 = a2;
            a2 = result;
        }

        return a2;
    }
}
