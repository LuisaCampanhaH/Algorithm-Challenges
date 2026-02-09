/*
 * PROBLEMA: 1003 - Simple Sum (Soma Simples)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1003
 * LINGUAGEM: Java
 *
 * RESUMO:
 * Ler dois valores inteiros (A e B).
 * Calcular a soma entre eles e atribuir à variável SOMA.
 * Imprimir o resultado no formato "SOMA = X".
 */

import java.io.IOException;
import java.util.Scanner;

public class Sum{
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int SOMA = A + B;
        
        System.out.println("SOMA = " + SOMA);
        
        sc.close();
    }
}