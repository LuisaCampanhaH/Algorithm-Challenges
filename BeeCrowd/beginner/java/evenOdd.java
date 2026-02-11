/*
 * PROBLEMA: 1066 - Even, Odd, Positive and Negative (Pares, Ímpares, Positivos e Negativos)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1066
 * LINGUAGEM: Java
 *
 * RESUMO:
 * Ler 5 valores inteiros.
 * Contar quantos são pares, quantos são ímpares, quantos são positivos e quantos são negativos.
 * Importante: O número 0 é par, mas não é positivo nem negativo.
 * Imprimir as 4 mensagens conforme o exemplo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        
        // Loop para ler 5 valores
        for (int i = 0; i < 5; i++) {
            int valor = sc.nextInt();
            
            // Verifica par ou ímpar (resto da divisão por 2)
            if (valor % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            
            // Verifica positivo ou negativo (0 é neutro neste contexto)
            if (valor > 0) {
                positivos++;
            } else if (valor < 0) {
                negativos++;
            }
        }
        
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
        
        sc.close();
    }
}