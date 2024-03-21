# Rede Social Simplificada com Listas Duplamente Encadeadas

Este é um projeto simples que implementa uma rede social simplificada utilizando listas duplamente encadeadas para representar as relações de amizade entre pessoas.

## Funcionalidades

- **Criar Perfil:** Armazena nome, idade e cidade da pessoa, criando um nó na lista duplamente encadeada para representá-la.
- **Adicionar Amigo:** Adiciona uma pessoa como amiga de outra e vice-versa.
- **Remover Amigo:** Remove a relação de amizade entre duas pessoas.
- **Listar Rede Social:** Exibe a lista de pessoas e suas amizades.

## Exemplo de Uso

```java
    	// Criar perfis
redeSocial.criarPerfil("João", 25, "São Paulo");
redeSocial.criarPerfil("Maria", 24, "Rio de Janeiro");
redeSocial.criarPerfil("Flavia", 23, "São Paulo");

// Adicionar amigos
redeSocial.adicionarAmigo("Maria", "Flavia");

// Imprimir a rede social
System.out.println("Rede Social:");
System.out.println(redeSocial);

// Remover amigo
redeSocial.removerAmigo("Maria", "Flavia");

// Imprimir a rede social após remover amigo
System.out.println("\nRede Social após remover amigo:");
System.out.println(redeSocial);

```


## Como Executar

1. Clone o repositório.
2. Abra o projeto em sua IDE Java.
3. Execute a classe `Programa`.

## Autor

Lucas de Oliveira lessa
