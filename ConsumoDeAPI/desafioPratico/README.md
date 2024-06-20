# Consulta Livro Open Library

Este projeto é um exemplo de como consumir a API da Open Library para buscar informações sobre livros.

## Como o código funciona

1. Entrada do Usuário:

*O programa solicita ao usuário que digite o título do livro que deseja buscar.

2.Construção do URL de Requisição:

*O título do livro fornecido pelo usuário é incorporado ao URL de requisição para a Open Library API.

3. Envio da Requisição:

*Um cliente HTTP é criado e uma requisição HTTP GET é enviada para o endpoint da Open Library.

4. Recebimento da Resposta:

*A resposta da API é recebida e o corpo da resposta (em formato JSON) é impresso no console.

## Como Usar

1. Clone este repositório.
2. Compile o código Java.
3. Execute o programa e digite o título do livro para busca.

## Pré-requisitos

- Java 11 ou superior
- Internet para acessar a API da Open Library

## Compilação e Execução

No terminal, navegue até o diretório `src` e execute os seguintes comandos:

```bash
javac desafioPratico/ConsultaLivroOpenLibrary.java
java desafioPratico.ConsultaLivroOpenLibrary
