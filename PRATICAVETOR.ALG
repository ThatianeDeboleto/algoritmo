Algoritmo "PraticaVetor"

Var
// Seção de Declarações das variáveis 
notas: vetor [1..10] de real
nomes: vetor[1..10] de caractere
i: inteiro
media: real
soma: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
PARA i DE 1 ATE 10 FACA
     ESCREVA("Digite o nome do aluno(a) número ", i, " de 10: ")
     LEIA(nomes[i])
     ESCREVA("Digite a nota do aluno(a) número ", i, " de 10: ")
     LEIA(notas[i])
     soma <- soma + notas[i]
FIMPARA
media <- soma/i
      ESCREVAL("Média de notas da turma: ", media)

Fimalgoritmo