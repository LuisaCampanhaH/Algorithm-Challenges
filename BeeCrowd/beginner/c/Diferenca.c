// Exercicio 1007: Diferenca
// Link: https://judge.beecrowd.com/en/problems/view/1007
//Descrição: Diferença do produto da subtração de quatro variaveis inteiras.
// Formula usada: ((a*b)-(c*d)), sendo a, b, c, d numero inteiros.
#include <stdio.h>
 
int main() {
    int a,b,c,d,diferenca;
    scanf("%i %i %i %i",&a,&b,&c,&d);
    diferenca = ((a*b)-(c*d));
    printf("DIFERENCA = %i\n",diferenca);
 
    return 0;
}