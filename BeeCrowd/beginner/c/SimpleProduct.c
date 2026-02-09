/*
 * PROBLEMA: 1004 - Simple Product (Produto Simples)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1004
 * LINGUAGEM: C
 *
 * DESCRIÇÃO:
 * Ler dois valores inteiros, calcular o produto entre eles e 
 * mostrar o resultado conforme o padrão exigido.
 */

#include <stdio.h>

int main() {
    int a, b, produto;

    scanf("%d %d", &a, &b);

    produto = a * b;

    // Atenção: O Beecrowd exige espaços antes e depois do '=' e o \n no final
    printf("PROD = %d\n", produto);

    return 0;
}