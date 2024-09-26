package com.stjean.TPTEST.Modele;

public class Calculatrice {

    public double somme(int a, int b) {
        return a + b;
    }

    public double soustraction(int a, int b) {
        return a - b;
    }

    public double multiplication(int a, int b) {
        return a * b;
    }
    public double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return (double) a / b;
    }

    public int maximum(int a, int b) {
        return Math.max(a, b);
    }

    public long factoriel(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Le nombre doit être positif");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public boolean isNegatif(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }
}
