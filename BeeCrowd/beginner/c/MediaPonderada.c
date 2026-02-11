// Exercicio 1006: Avarage 2
// Link: https://judge.beecrowd.com/en/runs/code/47845160
// Descrição: Calculo da media ponderada de tres variaveis naturais
#include <stdio.h>
int main() {
    float x,y,z,avarage;
    scanf("%f %f %f",&x,&y,&z);
    avarage = ((x * 2) + (y * 3) + (z * 5))/10;
    printf("MEDIA = %.1f\n",avarage);
    return 0;
}