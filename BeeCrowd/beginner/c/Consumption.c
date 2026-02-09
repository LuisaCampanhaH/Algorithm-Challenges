/*
 * PROBLEMA: 1014 - Consumption (Consumo)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1014
 * LINGUAGEM: C
 *
 * DESCRIÇÃO:
 * Calcular o consumo médio de um automóvel (Km/L) com base na
 * distância percorrida (X) e no combustível gasto (Y).
 */

#include <stdio.h>

int main() {
    int km;
    double fuel;
    double consumption;

    scanf("%d %lf", &km, &fuel);

    consumption = km / fuel;

    printf("%.3lf km/l\n", consumption);

    return 0;
}