# caelum-fj11

* [Apostila online](https://www.caelum.com.br/apostila-java-orientacao-objetos/) 
* [Apostila offline](https://www.caelum.com.br/download/caelum-java-objetos-fj11.pdf) 

Rascunho de Aulas
```

JAMES GOSLING (PAI DO JAVA - SUN)

PORTABILIDADE: software ----> chip---->hardware

LINGUAGEM C

CÓDIGO FONTE(WIN-MAC-LINUX)--> COMP\(WIN-MAC-LINUX)-->EXE (WIN-MAC-LINUX)

LINGUAGEM JAVA

CÓDIGO FONTE (.JAVA) -->COMPILADOR-->BYTECODE(.CLASS)-->JVM (WIN-MAC-LINUX)


EXECUÇÃO: JVR - (JVM-LIBS)

DEV: JDK - (JVM-LIBS-COMPILADOR)

REGRAS

classe - 1 LETRA MAIÚSCULA
método - 1 minuscula 2 LETRA NOME MAIÚSCULA

Padrão mercado: Cada arquivo. java uma classe

||
&&


IF (condicaobooleana) {
codigo;
}


Classe 

Faz 	= métodos
Tem	 = atributos 

ENCAPSULAMENTO - PRIVATE
CONSTRUTORES - 
STATIC - 

intellij (universitário) 


REFAZER (ESTUDAR - JAVA E JAVADOC)
CAPÍTULOS 4 E 5 


CLASSES( O que tem - O que faz  ) X OBJETOS
atributos
métodos
construtores
-- static
-- packpage
-- encapsulamento (OO) = Saber oq faz, independentemente de como.
  	atributos private e oq se pode ser acessado public


HERANÇA - 

POLIMORFISMO - 

INTERFACE - 

ERRO DE EXECUÇÃO - EXCEPTION 

TRY[TESTE ISSO]------>CATCH [CORREÇÃO DE PROBLEMA]

ESTUDAR CAP 12



https://sistema.caelum.com.br/avaliacao/b01e59f
Substituto Instrutor ALLAN 
allan.romanato@caelum.com.br
11 97226-4450

Throwable
EXCEPTION  (CHECKED/UNCHECKED) - TRATE  
ERROR - NÃO TRATE

String metodo1 () throws SqlException {
if (sucess)
 return “sucesso”;
}
throw new sql exception ();
}


main {
try {
metodo1();

} catch (exception e ) {
}

} catch (... exception e ) {
}


public class MinhaException extends Exception {

public  MinhaException () {
super();
}

public  MinhaException (String msg) {
super(msg);
}
public  MinhaException (throwable t ) {
super(t);
}
public  MinhaException () {
super(msg, t);
}


Desenvolvedor (criar a lógica) > Programador (implementar código)

ESTUDAR ;

JAVA 8 - DEFAULT METHODS , LAMBDA

MÉTODOS STRING
SUBSTRING
EQUALS
SPLIT
LOWER/UPPERCASE
REPLACE
-INDEXOF


13.5 e 13.7


array

conta corrente [] c = new contacorrente [10];

COLLECTION

LIST: ARRAY LIST, LINKED LIST

GENÉRICO - list x = new arraylist ();

ESPECÍFICO - list <Integer> y = new array list <>( ) ;

FOR (INTEGER  i : y){
sysout(i);
}


colleftions.sort (y);

