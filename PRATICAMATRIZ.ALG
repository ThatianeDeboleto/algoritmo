Algoritmo "PraticaMatriz"

var
vetA:vetor[1..5,1..5] de real
vetB:vetor[1..5,1..5] de real
i,j,x:inteiro
a    : caractere
inicio
// Se��o de Comandos
  para i de 1 ate 5 faca
    para j de 1 ate 5 faca
      escreva("Digite o valor da linha e coluna: [",i, " , ", j, " ] ")
      leia(vetA[i,j])
    fimpara
  fimpara
  escreval
  escreval("Digite Um N�mero Para Multiplicar")
  leia(x)
  escreval
  para i de 1 ate 5 faca
    vetA[i,2] := vetA[i,2]*x
  fimpara
  para i de 1 ate 5 faca
    para j de 1 ate 5 faca
      a := numpcarac(vetA[i,j])
      se (vetA[i,j] >-1 ) e (vetA[i,j] < 10) ENT�O
        a := "    "+a
      senao
        se (vetA[i,j] >= 10) e (vetA[i,j] < 100) ENT�O
          a := "   "+a
        senao
          se (vetA[i,j] >= 100) e (vetA[i,j] < 1000) ENT�O
            a := "  "+a
          senao
            a := " "+a
          fimse
        fimse
      fimse
      se j < 5 ENT�O
        a := a+" - "
      fimse
      escreva( a )
    fimpara
    escreval("")
  fimpara
fimalgoritmo