Algoritmo "VETORNOME"

Var
// Se��o de Declara��es das vari�veis 
nomes: vetor[1..5] de caractere
contadorLoop1: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
PARA contadorLoop1 DE 1 ATE 5 FACA
     ESCREVA("Digite o nome do aluno(a) n�mero ", contadorLoop1, " de 5: ")
     LEIA(nomes[contadorLoop1])
FIMPARA
//APRESENTA��O DOS RESULTADOS
PARA contadorLoop1 DE 1 ATE 5 FACA
    ESCREVAL("Nome do aluno(a) ", nomes[contadorLoop1])
FIMPARA
Fimalgoritmo