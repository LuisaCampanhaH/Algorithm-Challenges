package java;
// PROBLEMA 1006 - Average 2
// LINK - (https://judge.beecrowd.com/en/problems/view/1006)//
// DESCRIÇÃO: MEDIA PONDERADA SENDO O PRIMEIRO VALOR COM PESO 2, 
// O SEGUNDO COM PESO 3 E O TERCEIRO COM PESO 5.
// CADA NOTA PODE IR DE 0 A 10.0//
// INPUT: 5.0 6.0 7.0 //
// OUTPUT : MEDIA = 6.3//
// LINGUAGEM: JAVA //

import java.util.Scanner;

public class AVERAGE2 {
    public static void main (String[] args)
    {
        float a;
        float b; 
        float c; 
        float media;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        media = a * 2;
        media += b * 3;
        media += c * 5;
        media = media / 10;
        System.out.printf("MEDIA = %.1f%n", media);
        sc.close();
    }
}
