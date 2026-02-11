/*
 * PROBLEMA: 1072 - Interval 2 (Intervalo 2)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1072
 * LINGUAGEM: Java
 *
 * RESUMO:
 * Ler um inteiro N que indica a quantidade de valores a serem lidos.
 * Ler N valores inteiros X.
 * Contar quantos destes valores estão dentro do intervalo [10, 20] (in) e quantos estão fora (out).
 * Imprimir as quantidades conforme o exemplo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int in = 0;
        int out = 0;
        
        // Loop para ler os N valores
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            
            // Verifica se X está no intervalo [10, 20]
            if (X >= 10 && X <= 20) {
                in++;
            } else {
                out++;
            }
        }
        
        System.out.println(in + " in");
        System.out.println(out + " out");
        
        sc.close();
    }
}