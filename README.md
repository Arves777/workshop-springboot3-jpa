# Projeto: API REST com Spring Boot, JPA e Hibernate

## Descrição
Este projeto consiste em uma API REST desenvolvida com Spring Boot, utilizando JPA/Hibernate para a persistência de dados. O objetivo é criar um sistema robusto de web services, implementando um modelo de domínio bem estruturado e operações CRUD com tratamento de exceções.

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database (ambiente de testes)
- PostgreSQL (produção)
- Maven

## Instalação e Configuração

### Requisitos
Antes de executar o projeto, certifique-se de ter instalado:
- JDK 17+
- Maven
- PostgreSQL (para produção)

### Configuração do Banco de Dados
#### Banco de Dados de Teste (H2)
1. O H2 já está configurado no `application-test.properties`
2. Para acessar o console do H2: `http://localhost:8080/h2-console`

#### PostgreSQL (Local ou Produção)
1. Instale o PostgreSQL em [postgresql.org](https://www.postgresql.org/download/)
2. Crie um banco de dados chamado `springboot_course`
3. Atualize as credenciais no arquivo `application-dev.properties`

### Configuração do Projeto
1. Clone o repositório:
   ```sh
   git clone <URL_DO_REPOSITORIO>
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd projeto-spring-jpa
   ```
3. Compile e execute o projeto:
   ```sh
   mvn spring-boot:run
   ```

O servidor estará rodando em `http://localhost:8080`.

## Estrutura do Projeto
```
projeto-spring-jpa/
│-- src/main/java/
│   ├── domain/          # Classes de domínio (User, Order, Product, etc.)
│   ├── dto/             # Data Transfer Objects
│   ├── repository/      # Interfaces de acesso ao banco de dados
│   ├── services/        # Regras de negócio
│   ├── resources/       # Controllers REST
│   ├── config/          # Configuração inicial do banco de dados
│-- src/main/resources/
│   ├── application.properties  # Configurações gerais
│   ├── application-test.properties  # Configuração para H2
│   ├── application-dev.properties  # Configuração para PostgreSQL
│-- pom.xml            # Dependências do projeto
```

## Endpoints
### Usuários (`/users`)
- `GET /users` - Retorna todos os usuários
- `GET /users/{id}` - Retorna um usuário por ID
- `POST /users` - Insere um novo usuário
- `DELETE /users/{id}` - Remove um usuário
- `PUT /users/{id}` - Atualiza um usuário

### Pedidos (`/orders`)
- `GET /orders/{id}` - Retorna um pedido por ID

### Produtos (`/products`)
- `GET /products` - Retorna todos os produtos

## Exemplos de Dados
### Usuário
```json
{
  "id": 1,
  "name": "Maria Brown",
  "email": "maria@gmail.com",
  "phone": "988888888",
  "password": "123456"
}
```

### Pedido
```json
{
  "id": 1,
  "moment": "2019-06-20T19:53:07Z",
  "client": {
    "id": 1,
    "name": "Maria Brown"
  }
}
```

### Produto
```json
{
  "id": 1,
  "name": "Smart TV",
  "description": "Tela 4K, 50 polegadas",
  "price": 2190.0
}
```

## Deploy no Heroku
1. Criar uma conta no [Heroku](https://www.heroku.com/)
2. Criar um novo app e provisionar um banco PostgreSQL
3. Configurar variáveis de ambiente (`DATABASE_URL`, `JWT_SECRET`, etc.)
4. Atualizar `application-prod.properties` para usar as variáveis do Heroku
5. Fazer deploy com:
   ```sh
   git add .
   git commit -m "Deploy app to Heroku"
   git push heroku main
   ```

## Autor
Desenvolvido por Adrian Rosselis com os conhecimentos obtidos no curso de Java do professor Nélio Alves.

## Licença
Este projeto está licenciado sob a [MIT License](LICENSE).
