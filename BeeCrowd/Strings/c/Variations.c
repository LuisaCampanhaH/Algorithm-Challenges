#include <stdio.h>
#include <ctype.h> // Necessário para a função tolower()
#include <string.h>

int main() {
    int T;
    
    // Lê o número de casos de teste
    scanf("%d", &T);

    while (T--) {
        char senha[100]; // Buffer para ler a senha (o problema diz max 16, mas 100 é seguro)
        scanf("%s", senha);

        long total_variacoes = 1; // Usamos long para garantir que o número caiba, embora int sirva para 3^16

        // Percorre cada caractere da senha
        for (int i = 0; i < strlen(senha); i++) {
            // Converte para minúsculo para facilitar a comparação
            char c = tolower(senha[i]);

            // Verifica se é uma das letras especiais
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 's') {
                total_variacoes *= 3; // (minúscula, maiúscula, número)
            } else {
                total_variacoes *= 2; // (minúscula, maiúscula)
            }
        }

        printf("%ld\n", total_variacoes);
    }

    return 0;
}