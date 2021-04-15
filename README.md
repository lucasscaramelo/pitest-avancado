# Pitest Avançado

Neste projeto, mostrarei um pouco sobre algumas configurações avançadas de execução do Pitest.

Através dos parâmetros estruturados no arquivo POM, é possível determinar a quantidade de mutantes a serem gerados, mapear as classes que queremos que ocorra as mutações e definir algumas condições para que a execução falhe. Além disso, podemos definir alguns atributos para geração do relatório.

------------------------------------------------------------
Formas de execução:
> mvn org.pitest:pitest-maven:mutationCoverage

> mvn -DwithHistory org.pitest:pitest-maven:mutationCoverage

> mvn test

