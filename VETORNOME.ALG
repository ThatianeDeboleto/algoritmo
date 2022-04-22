Algoritmo "VETORNOME"

Var
// Seção de Declarações das variáveis 
nomes: vetor[1..5] de caractere
contadorLoop1: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
PARA contadorLoop1 DE 1 ATE 5 FACA
     ESCREVA("Digite o nome do aluno(a) número ", contadorLoop1, " de 5: ")
     LEIA(nomes[contadorLoop1])
FIMPARA
//APRESENTAÇÃO DOS RESULTADOS
PARA contadorLoop1 DE 1 ATE 5 FACA
    ESCREVAL("Nome do aluno(a) ", nomes[contadorLoop1])
FIMPARA
Fimalgoritmo