# exercicios_java
- uma String é declarada com aspas duplas " e pode ter zero ou mais caracteres.
- Um char é declarado com aspas simples ' e pode usar apenas um caractere.
- Não usa aspas ao imprimir o valor que está guardado em uma variável.
- Não usa um valor com ponto flutuante dentro de uma variável do tipo int
- O tipo char guarda apenas um caractere da tabela unicode, por isso, quando passamos um valor numérico, teremos como saída o caractere correspondente ao número na tabela unicode. 
## "casting"
- refere-se ao processo de converter o tipo de uma variável em outro tipo compatível.
### Casting Implícito (ou Widening Casting)
- Ocorre quando converte um tipo de dado menor em um tipo de dado maior. Por exemplo, converter um valor inteiro em um valor de ponto flutuante.
int x = 5;
double y = x; // Casting implícito
### Casting Explícito (ou Narrowing Casting)
- Ocorre quando você está convertendo um tipo de dado maior em um tipo de dado menor. Por exemplo, converter um valor de ponto flutuante em um valor inteiro
double x = 3.14;
int y = (int) x; // Casting explícito
