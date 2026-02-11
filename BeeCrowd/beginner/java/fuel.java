/*
 * PROBLEMA: 1017 - Fuel Spent (Gasto de Combustível)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1017
 * LINGUAGEM: Java
 *
 * RESUMO:
 * Ler o tempo gasto na viagem (em horas) e a velocidade média (em km/h).
 * Calcular a distância percorrida (Tempo * Velocidade).
 * Calcular a quantidade de litros necessária considerando que o carro faz 12 km/L.
 * Imprimir o resultado com 3 casas decimais.
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US); // Garante o ponto como separador decimal
        Scanner sc = new Scanner(System.in);
        
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        
        // Calcula a distância: Distância = Tempo * Velocidade
        // Calcula os litros: Litros = Distância / 12
        // Utilizamos 12.0 para garantir que o resultado seja um número decimal (double)
        double litros = (tempo * velocidade) / 12.0;
        
        System.out.printf("%.3f%n", litros);
        
        sc.close();
    }
}