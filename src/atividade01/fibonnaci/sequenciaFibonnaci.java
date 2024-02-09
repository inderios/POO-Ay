package atividade01.fibonnaci;

import java.util.Scanner;

public class sequenciaFibonnaci {
    public static int fib(int i) {
        if (i <= 1) {
            return i;
        }
        return fib(i-1) + fib(i - 2);
    }

    public static void main(String[] args) {
        inicia();
    }
    public static void inicia() {
        Scanner n = new Scanner(System.in);
        int l = Integer.parseInt(n.nextLine());
        for (int p = 0; p < l; p++) {
            System.out.println(fib(p));
        }
    }
}
;
