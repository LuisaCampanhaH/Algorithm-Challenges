// Exercicio 
// link:
//Descrição: Consumo de gasolina de um carro que consome 12km/l.

#include <stdio.h>
 
int main() {
 int d,h,v;float f;
 scanf("%i %i",&h,&v);
 d = v/h;
 f = d/12;
 printf("%.3f\n",f);
    return 0;
}