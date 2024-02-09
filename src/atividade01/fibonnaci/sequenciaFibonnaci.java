package atividade01.fibonnaci;

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

        for (int p = 0; p < 10; p++) {
            System.out.println(fib(p));
        }
    }
}
;
