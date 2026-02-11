/*
 * PROBLEMA: 1060 - Positive Numbers (Números Positivos)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1060
 * LINGUAGEM: Java
 *
 * RESUMO:
 * Ler 6 valores.
 * Contar quantos desses valores são positivos (maiores que zero).
 * Imprimir a quantidade encontrada seguida da mensagem " valores positivos".
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US); // Garante leitura correta de decimais se houver
        Scanner sc = new Scanner(System.in);
        
        int contagemPositivos = 0;
        
        // Loop para ler 6 valores
        for (int i = 0; i < 6; i++) {
            double valor = sc.nextDouble();
            
            // Verifica se é positivo
            if (valor > 0) {
                contagemPositivos++;
            }
        }
        
        System.out.println(contagemPositivos + " valores positivos");
        
        sc.close();
    }
}