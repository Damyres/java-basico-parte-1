package com.loiane.cursojava.aula16;

public class LoopWhile {

    public static void main(String[] args) {

        int i = 0;
        int max = 10;

        System.out.println("Contando até " + max);

        while(i <= max){
            System.out.println("O valor de i é " + i);
            i += 1;
        }
        System.out.println(i);
    }
}
