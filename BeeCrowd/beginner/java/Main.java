/*
 * PROBLEMA: 1015 - Distance Between Two Points (Distância Entre Dois Pontos)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1015
 * LINGUAGEM: Java
 *
 * RESUMO:
 * Ler os quatro valores correspondentes aos eixos x e y de dois pontos (p1 e p2).
 * Calcular a distância entre eles usando a fórmula: Distancia = raiz((x2 - x1)^2 + (y2 - y1)^2).
 * Imprimir o resultado com 4 casas decimais.
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale; // Importante para garantir o ponto como separador decimal

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US); // Define o padrão numérico americano (ponto em vez de vírgula)
        Scanner sc = new Scanner(System.in);
        
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        // Calcula a diferença dos eixos ao quadrado
        double parte1 = Math.pow(x2 - x1, 2);
        double parte2 = Math.pow(y2 - y1, 2);
        
        // Calcula a raiz quadrada da soma
        double distancia = Math.sqrt(parte1 + parte2);
        
        // Imprime com 4 casas decimais
        System.out.printf("%.4f%n", distancia);
        
        sc.close();
    }
}