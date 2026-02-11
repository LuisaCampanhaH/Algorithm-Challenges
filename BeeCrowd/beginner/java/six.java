/*
 * PROBLEMA: 1070 - Six Odd Numbers (Seis Números Ímpares)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1070
 * LINGUAGEM: Java
 *
 * RESUMO:
 * Ler um valor inteiro X.
 * Imprimir os 6 valores ímpares consecutivos a partir de X, inclusive o próprio X se ele for ímpar.
 * Lógica:
 * - Se X for par, somamos 1 para torná-lo o primeiro ímpar da sequência.
 * - Depois, basta imprimir X e somar 2 repetidamente num loop de 6 iterações.
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        
        // Se X for par, o primeiro ímpar será X + 1
        if (X % 2 == 0) {
            X++;
        }
        
        // Imprime 6 números ímpares consecutivos
        for (int i = 0; i < 6; i++) {
            System.out.println(X);
            X += 2; // Pula para o próximo ímpar
        }
        
        sc.close();
    }
}