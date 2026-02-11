/*
 * PROBLEMA: 1059 - Even Numbers (Números Pares)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1059
 * LINGUAGEM: Java
 *
 * RESUMO:
 * O problema pede para imprimir todos os números pares entre 1 e 100, inclusive.
 * Não há entrada de dados.
 * A lógica mais eficiente é fazer um loop começando em 2 e incrementando de 2 em 2.
 */

import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        // Loop de 2 até 100, pulando de 2 em 2 (2, 4, 6, 8...)
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
        
    }
}