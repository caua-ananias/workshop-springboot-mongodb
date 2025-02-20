# Workshop Spring Boot com MongoDB

## 💻 Sobre o Projeto
API RESTful construída com Spring Boot e MongoDB, implementando um sistema de posts e usuários similar a uma rede social simples.

## 🛠 Tecnologias Utilizadas
- Java 17
- Spring Boot
- MongoDB
- Maven

## 📋 Funcionalidades

### Usuários
- Listar todos os usuários
- Buscar usuário por ID
- Inserir novo usuário
- Atualizar usuário
- Deletar usuário
- Recuperar posts de um usuário

### Posts
- Buscar post por ID
- Buscar posts por título
- Busca completa (por texto, data mínima e data máxima)

## 🔄 Endpoints

### Usuários (`/users`)
### Posts (`/posts`)

## 📦 Estrutura do Projeto
- `domain` - Entidades do domínio
- `dto` - Objetos de Transferência de Dados
- `resources` - Controladores REST
- `services` - Lógica de negócios
- `repository` - Interfaces de acesso ao banco de dados

## 🚀 Como Executar

1. Clone o repositório
2. Certifique-se de ter o MongoDB instalado e rodando localmente
3. Execute o projeto usando Maven
4. A API estará disponível em `http://localhost:8080`
