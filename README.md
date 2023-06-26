# Anotações - Java 
## Características
- Orientado a Objeto (O.O.)
- Muitas bibliotecas
- Parece com C++ 
- Roda em vários sistemas operacionais
  ## Variáveis e Caracteres
- Uma String é declarada com aspas duplas " e pode ter zero ou mais caracteres
- Um char é declarado com aspas simples ' e pode usar apenas um caractere
- Ao imprimir o valor que está guardado em uma variável, não usa aspas
- Dentro de uma variável do tipo int, não usa um valor com ponto flutuante
- O tipo char guarda apenas um caractere da tabela unicode, por isso, quando passamos um valor numérico, teremos como saída o caractere correspondente ao número na tabela unicode
## "Casting"
- refere-se ao processo de converter o tipo de uma variável em outro tipo compatível.
### Casting Implícito (ou Widening Casting)
- Ocorre quando converte um tipo de dado menor em um tipo de dado maior. Por exemplo, converter um valor inteiro em um valor de ponto flutuante.
int x = 5;
double y = x; // Casting implícito
### Casting Explícito (ou Narrowing Casting)
- Ocorre quando você está convertendo um tipo de dado maior em um tipo de dado menor. Por exemplo, converter um valor de ponto flutuante em um valor inteiro
double x = 3.14;
int y = (int) x; // Casting explícito
## Paradigma Procedural x Objetos 
- A ideia central do paradigma da Orientação a Objetos é que Dados e funcionalidades devem estar juntos
- O Paradigma Procedural se baseia na ideia de que um programa é composto por uma série de procedimentos ou funções que são executados em ordem
## Classe
Uma classe é composta por um conjunto de variáveis de instância (atributos) e métodos, que descrevem o comportamento do objeto
