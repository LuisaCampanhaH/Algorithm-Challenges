// PROBLEMA 1014 - Consumption
// LINK - (https://judge.beecrowd.com/en/problems/view/1014)//
// DESCRIÇÃO: consumo de gasolina de um carro(km por litro)
// INPUT: X (KM) E Y(fuel)  //
// OUTPUT : Z km/L//
// LINGUAGEM: C //
int main()
{
    double fuel;
    int km;
    double consumption;
    scanf("%i %lf",&km,&fuel);
    consumption = km / fuel;
    printf("%.3lf km/l\n",consumption);
    return 0;
    
}