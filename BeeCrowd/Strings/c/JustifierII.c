/*
 * PROBLEMA: 1278 - Justificador II (Justifier II)
 * PLATAFORMA: Beecrowd
 * LINK: https://judge.beecrowd.com/en/problems/view/1278
 * LINGUAGEM: C
 *
 * RESUMO:
 * Ler N linhas, remover espaços excedentes e alinhar o texto à direita
 * baseando-se na linha de maior comprimento. Imprimir uma linha em branco
 * apenas ENTRE os casos de teste.
 */


#include <stdio.h>
#include <string.h>

int main() {
    int N;
    int primeiro_caso = 1;

    // Lê N. O loop para quando N for 0.
    while (scanf("%d", &N) && N != 0) {
        
        // Consome a quebra de linha que sobra após o scanf do número
        getchar();

        // Se não for o primeiro caso, imprime uma linha em branco para separar
        if (!primeiro_caso) {
            printf("\n");
        }
        primeiro_caso = 0;

        char linhas_processadas[100][100]; // Array para guardar as linhas limpas
        int max_len = 0;

        // Loop para ler e processar cada linha
        for (int i = 0; i < N; i++) {
            char buffer[1000];
            fgets(buffer, 1000, stdin);

            // Remove o \n que o fgets pega
            buffer[strcspn(buffer, "\n")] = 0;

            // Lógica para limpar espaços extras
            char linha_limpa[100] = "";
            char *palavra = strtok(buffer, " "); // Quebra a string onde houver espaços

            while (palavra != NULL) {
                // Se já temos algo na linha limpa, adicionamos UM espaço antes da próxima palavra
                if (strlen(linha_limpa) > 0) {
                    strcat(linha_limpa, " ");
                }
                strcat(linha_limpa, palavra);
                
                // Pega a próxima palavra
                palavra = strtok(NULL, " ");
            }

            // Salva a linha processada no array
            strcpy(linhas_processadas[i], linha_limpa);

            // Verifica se essa é a nova maior linha
            int len_atual = strlen(linha_limpa);
            if (len_atual > max_len) {
                max_len = len_atual;
            }
        }

        // Loop de impressão
        for (int i = 0; i < N; i++) {
            // %*s permite definir a largura (max_len) dinamicamente.
            // O printf preenche com espaços à esquerda automaticamente (Justify Right)
            printf("%*s\n", max_len, linhas_processadas[i]);
        }
    }

    return 0;
}