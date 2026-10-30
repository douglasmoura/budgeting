Budgeting — Assistente Financeiro com Spring AI

--Sobre o projeto--

O Budgeting é uma API desenvolvida em Java com Spring Boot e Spring AI, com o objetivo de facilitar o controle de gastos financeiros.

A aplicação permite cadastrar transações, consultar despesas por categoria e utilizar inteligência artificial para interpretar informações financeiras enviadas por áudio.

A ideia é permitir que o usuário informe seus gastos de maneira simples, inclusive utilizando a própria voz.

Como executar a aplicação

--Pré-requisitos--

Java 25 instalado

Docker Desktop instalado e em execução

Git instalado

Uma chave de API da OpenAI para utilizar os recursos de inteligência artificial.

1. Clonar o repositório

2. Configurar a chave da OpenAI

3. Iniciar o banco de dados

4. Executar a aplicação

--Tecnologias utilizadas--

Java 25, Spring Boot 4.1.2, Spring AI 2.0.0-M4, Spring Data JPA, Hibernate, MySQL 9.6, Docker e Docker Compose, Gradle, Lombok, OpenAI API

--Melhoria implementada--

Uma das melhorias desenvolvidas foi a implementação da persistência das transações utilizando MySQL e Spring Data JPA.

Também foi trabalhada a separação entre as regras de negócio e a infraestrutura, utilizando interfaces de repositório e adaptadores para comunicação com o banco de dados.

Outra decisão foi utilizar UUID como identificador das transações, por meio da classe TransactionId.

Essas mudanças ajudam a organizar o código e facilitam futuras evoluções do projeto.

Como testar o fluxo principal

A API pode ser testada utilizando ferramentas como Postman ou Insomnia.

1. Cadastrar uma transação

Método: POST

Endpoint: /transactions

Envie os dados da transação no formato JSON.

2. Consultar transações por categoria

Método: GET

Endpoint: /transactions/GROCERIES

Também é possível consultar outras categorias disponíveis, como PHARMA e AUTO.

3. Testar o fluxo com inteligência artificial

Método: POST

Endpoint: /transactions/ai

Envie um arquivo de áudio utilizando multipart/form-data, com o campo file.

A aplicação transcreve o áudio, interpreta a informação utilizando IA e pode executar operações financeiras, retornando uma resposta em áudio.

--O que aprendi durante o desafio--

Durante o desenvolvimento deste projeto, pude aprofundar meus conhecimentos em Java e Spring Boot, principalmente na construção de APIs REST.

Também pratiquei:

Organização de projetos utilizando separação por camadas.

Programação orientada a objetos.

Persistência de dados com Spring Data JPA e Hibernate.

Integração de aplicações Java com MySQL.

Utilização de Docker Compose.

Implementação de identificadores UUID.

Integração de inteligência artificial com Spring AI.

Uso de ferramentas da OpenAI para processamento de áudio e interpretação de informações.
