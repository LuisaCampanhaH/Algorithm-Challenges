// Exercicio 1014 
// Link:https://judge.beecrowd.com/en/problems/view/1014
// Descrição: O consumo de gasolina por kilometro rodado.
// Formula: Kilometro / litro de gasolina.
#include <stdio.h>
 
int main() {
 
    int km;
    float fuel,resposta;
    scanf("%i %f",&km,&fuel);
    resposta = km/fuel;
    printf("%.3f km/l\n",resposta);
 
    return 0;
}