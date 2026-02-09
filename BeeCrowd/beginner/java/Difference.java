/*
 * PROBLEMA: 1007 - Difference (Diferença)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1007
 * LINGUAGEM: Java
 *
 * RESUMO:
 * Ler 4 valores inteiros (A, B, C, D).
 * Calcular a diferença do produto de A e B pelo produto de C e D.
 * Fórmula: DIFERENCA = (A * B - C * D).
 */

import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
 
        int diferenca = (A * B) - (C * D);
 
        System.out.println("DIFERENCA = " + diferenca);
        
        sc.close();
    }
}