/*
 * PROBLEMA: 1019 - Time Conversion (Conversão de Tempo)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1019
 * LINGUAGEM: Java
 *
 * RESUMO:
 * Ler um valor inteiro N (em segundos).
 * Converter esse valor para o formato horas:minutos:segundos.
 * Lógica:
 * - 1 hora = 3600 segundos.
 * - 1 minuto = 60 segundos.
 * - O resto da divisão por 3600 são os segundos restantes para calcular minutos e segundos finais.
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        // Calcula as horas (divisão inteira por 3600)
        int horas = N / 3600;
        
        // Pega o resto dos segundos para calcular os minutos
        int resto = N % 3600;
        
        // Calcula os minutos (divisão inteira por 60)
        int minutos = resto / 60;
        
        // O que sobrar são os segundos
        int segundos = resto % 60;
        
        // Imprime no formato h:m:s sem espaços extras, conforme o exemplo
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        sc.close();
    }
}