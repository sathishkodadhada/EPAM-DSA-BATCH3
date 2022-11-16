package com.epam.dsa.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorization {
    public Integer[] primeFactorization(int x) {
        boolean[] primes = sieveOfEratosthenes(x);
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0 && primes[i]) {
                res.add(i);
                if (x / i != i) res.add(i);
            }
        }
        return res.toArray(new Integer[0]);
    }

    private boolean[] sieveOfEratosthenes(int n) {

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        return prime;
    }

    public static void main(String[] args) {
        System.out.println(1 / 3.0);
    }
}
