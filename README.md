# Projeto API de Relógios

> Implementar uma api contendo os métodos GET, POST, PUT e DELETE.

O projeto foi realizado usando o STS como IDE, Java 17, Spring Boot, Maven, banco de dados relacional MySql e Flyway para versionar o banco de dados da aplicação. 

## Executando

Primeiro é necessário ter o Postman e o MySql instalados e funcionando na máquina e abrir o projeto com a IDE desejada. 

Caso as credenciais do seu MySql não sejam padrão (root:root), atualize o arquivo 'application.properties" no local "src/main/resources/application.properties" conforme o exemplo abaixo:

>spring.datasource.username=*SEU_USER*
>spring.datasource.password=*SUA_SENHA*

No STS, basta clicar com o botão direito no projeto e clicar em "Run As" >  "Spring Boot App".

O banco de dados é preenchido com alguns dados assim que a aplicação é iniciada.

Usando o postman, importe a collection "API Relogios.postman_collection.json" para ter acesso e consumir todos os endpoints criados.



## Meta

Autor: Larissa Pereira Rocha – larissapero@gmail.com




