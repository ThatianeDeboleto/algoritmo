Algoritmo "PraticaVetor"

Var
// Se��o de Declara��es das vari�veis 
notas: vetor [1..10] de real
nomes: vetor[1..10] de caractere
i: inteiro
media: real
soma: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
PARA i DE 1 ATE 10 FACA
     ESCREVA("Digite o nome do aluno(a) n�mero ", i, " de 10: ")
     LEIA(nomes[i])
     ESCREVA("Digite a nota do aluno(a) n�mero ", i, " de 10: ")
     LEIA(notas[i])
     soma <- soma + notas[i]
FIMPARA
media <- soma/i
      ESCREVAL("M�dia de notas da turma: ", media)

Fimalgoritmo