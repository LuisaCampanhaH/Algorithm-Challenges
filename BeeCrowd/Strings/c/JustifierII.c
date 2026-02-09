// PROBLEMA 1278 - Justifier II
// LINK - (https://judge.beecrowd.com/en/problems/view/1278)//
// INPUT: The input contains several test cases.
// The first line of a test case will contain an integer N (1 ≤ N ≤ 100) indicating the number of lines
//  hat form the text. Each of the following N lines will contain a text, composed of 1 to 50 uppercase letters
// (‘A’-‘Z’) or spaces (‘ ’).
//   ll text lines will contain at least one letter.
// There may be more than one space character between words.
// Also, there may be leading and trailing spaces in the input lines.
// The end of input is indicated by N = 0.
//  OUTPUT :For each test case print the text lines with a single space character between words, 
// and padded on the left with space characters so that all the lines will have the same length as the longest 
// line existing in that text. Print an empty line between all the test cases. 
// There must be no trailing spaces printed out, 
// and you should discard any unnecessary leading spaces,
//  so that at least one line on every text starts with a letter.//
// // LINGUAGEM: C //

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