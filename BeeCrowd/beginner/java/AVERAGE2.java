/*
 * PROBLEMA: 1006 - Average 2 (Média 2)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1006
 * LINGUAGEM: Java
 *
 * RESUMO:
 * Ler 3 notas (A, B e C) com pesos 2, 3 e 5 respectivamente.
 * Calcular a média ponderada e imprimir com 1 casa decimal.
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        // Define o Locale para US para garantir que o ponto seja o separador decimal
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
 
        // Cálculo da média ponderada
        double media = ((A * 2) + (B * 3) + (C * 5)) / 10.0;
 
        System.out.printf("MEDIA = %.1f\n", media);
        
        sc.close();
    }
}