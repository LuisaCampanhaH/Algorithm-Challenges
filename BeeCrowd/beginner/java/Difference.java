package java;
// PROBLEMA 1007 - Difference
// LINK - (https://judge.beecrowd.com/en/problems/view/1007)//
// DESCRIÇÃO: Uma subtração simples de 4 numeros inteiros
// INPUT: 5 6 7 8  //
// OUTPUT : DIFERENCA = -26//
// LINGUAGEM: JAVA //

import java.util.Scanner;

public class Difference {
    public static void main (String[] args)
    {
        int a;
        int b;
        int c;
        int d;
        int diferenca;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();        
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        diferenca =(a*b) - (c*d);
        System.out.println("DIFERENCA = " + diferenca);
        sc.close();
    }

}
