# Conexão com Banco PostgreSQL (ElephantSQL) usando JDBC no Maven

Este é um exemplo simples de conexão a um banco de dados PostgreSQL utilizando JDBC (Java Database Connectivity) em um projeto Maven Java. O projeto demonstra como estabelecer uma conexão com um banco de dados PostgreSQL, realizar consultas, inserções e atualizações simples.

## Requisitos

- JDK (Java Development Kit) instalado
- Maven instalado
- Banco de dados PostgreSQL configurado e acessível

## Configuração do Banco de Dados

Antes de executar o código, é necessário configurar um banco de dados PostgreSQL. Você pode usar um banco de dados local ou um serviço hospedado, como o ElephantSQL.

1. Instale o PostgreSQL e crie um banco de dados.
2. Se estiver usando o ElephantSQL, registre-se em [ElephantSQL](https://www.elephantsql.com/) e crie um banco de dados PostgreSQL.
3. Anote as credenciais do banco de dados (URL do JDBC, nome de usuário e senha).

## Configuração do Projeto

Clone ou faça o download do projeto para sua máquina local.

```bash
git clone https://github.com/seu-usuario/seu-projeto.git
```

Abra o projeto em sua IDE favorita.

## Configuração do Maven

O projeto já está configurado para Maven. Não é necessário configurar nada adicionalmente.

## Configuração do JDBC

Certifique-se de que você tenha o driver JDBC do PostgreSQL adicionado ao seu projeto. Isso normalmente é feito via Maven. Adicione a seguinte dependência ao seu arquivo `pom.xml`:

```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.2.20</version> <!-- Verificar a versão mais recente no repositório Maven -->
</dependency>
```

## Executando o Projeto

1. Substitua as informações de conexão do banco de dados no código-fonte com as suas próprias credenciais:

```java
Connection conn = DriverManager.getConnection("jdbc:postgresql://HOST:PORTA/NOME_DO_BANCO", "USUARIO", "SENHA");
```

2. Descomente ou comente os métodos de acordo com as operações que deseja realizar (consultar, inserir, atualizar).

3. Execute o projeto. Se tudo estiver configurado corretamente, você deve ver a saída no console indicando o sucesso da operação.
