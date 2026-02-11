/*
 * PROBLEMA: 1038 - Snack (Lanche)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1038
 * LINGUAGEM: Java
 *
 * RESUMO:
 * Ler o código de um item e a quantidade deste item.
 * Identificar o preço unitário com base na tabela fornecida:
 * 1 - Cachorro Quente: R$ 4.00
 * 2 - X-Salada: R$ 4.50
 * 3 - X-Bacon: R$ 5.00
 * 4 - Torrada simples: R$ 2.00
 * 5 - Refrigerante: R$ 1.50
 * Calcular o total (Preço * Quantidade) e imprimir formatado.
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        
        double preco = 0.0;
        
        if (codigo == 1) {
            preco = 4.00;
        } else if (codigo == 2) {
            preco = 4.50;
        } else if (codigo == 3) {
            preco = 5.00;
        } else if (codigo == 4) {
            preco = 2.00;
        } else if (codigo == 5) {
            preco = 1.50;
        }
        
        double total = preco * quantidade;
        
        System.out.printf("Total: R$ %.2f%n", total);
        
        sc.close();
    }
}