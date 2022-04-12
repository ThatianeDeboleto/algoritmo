Algoritmo "AtividadePratica5B"

Var
// Seção de Declarações das variáveis 
Opcao: Inteiro
Numero, Resultado: Real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreval("Opções: ")
Escreval(" 1- Calcular o dobro do número")
Escreval(" 2- Calcular o triplo do número")
Escreval(" Escolha uma opção: ")
Leia(Opcao)
Escreva("Digite o número: ")
Leia(Numero)
Escolha(Opcao)
     Caso 1
          Resultado <- Numero*2
     Caso 2
          Resultado <- Numero*3
FimEscolha
Escreva(Resultado)



Fimalgoritmo