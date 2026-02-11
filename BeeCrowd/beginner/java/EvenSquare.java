/*
 * PROBLEMA: 1073 - Even Square (Quadrado de Pares)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1073
 * LINGUAGEM: Java
 *
 * RESUMO:
 * Ler um valor inteiro N.
 * Apresentar o quadrado de cada um dos valores pares de 1 até N (inclusive N, se for par).
 * O formato de saída deve ser "x^2 = y".
 * Lógica:
 * - Loop começando em 2 e indo até N, incrementando de 2 em 2.
 * - Calcular o quadrado (i * i) e imprimir formatado.
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        // Loop de números pares: começa em 2, vai até N, pula de 2 em 2
        for (int i = 2; i <= N; i += 2) {
            
            // Calcula o quadrado
            int quadrado = i * i;
            
            // Imprime no formato solicitado: 2^2 = 4
            System.out.println(i + "^2 = " + quadrado);
        }
        
        sc.close();
    }
}