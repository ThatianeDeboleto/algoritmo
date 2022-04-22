Algoritmo "AtividadePratica6-Tomada decisão PARA"

Var
// Seção de Declarações das variáveis 
i,multiplicacao,num: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
multiplicacao<-1
PARA i DE 1 ATE 5 FACA
     Escreval("Oi, digite um nº do tipo inteiro: ")
     Leia(num)
     multiplicacao<-multiplicacao*num
     i<-i+1
FIMPARA
       Escreval("Resultado da multiplicação: ", multiplicacao)

Fimalgoritmo