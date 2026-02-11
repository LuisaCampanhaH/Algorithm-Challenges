// Exercicio
// Link:
// Descrição: A distancia entre dois pontos qualquer, sendo ambos pontos dentro de um plano
// Formula: sqrt((pow(x - a,2.0) + pow(y - b, 2.0))), sendo o ponto 1(x,y) e o ponto 2(a,b)
// A fórmula é a raiz quadrada da soma dos quadrados das diferenças das coordenadas x e y, respectivamente, dos dois pontos.
#include <stdio.h>
#include <math.h>
int main() {
    double x,y,a,b,resposta;
    scanf("%lf %lf %lf %lf",&x,&y,&a,&b);
    resposta = (pow(x - a,2.0) + pow(y - b,2.0));
    resposta = sqrt(resposta);
    printf("%.4lf\n",resposta);
    return 0;
}