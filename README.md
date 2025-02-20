# API REST com Spring Boot e MongoDB

## 📝 Descrição
Sistema de posts e comentários estilo rede social desenvolvido com Spring Boot e MongoDB. A aplicação permite gerenciar usuários, posts e comentários, com funcionalidades de busca avançada.

## 🛠️ Tecnologias
- Java 17
- Spring Boot 3.4.2
- MongoDB
- Maven

## 📦 Funcionalidades

### 👥 Usuários
- CRUD completo (Create, Read, Update, Delete)
- Listagem de posts por usuário
- Dados armazenados: id, nome, email

### 📝 Posts
- Busca por ID
- Busca por título
- Busca full text (título, corpo e comentários)
- Filtro por intervalo de datas
- Dados armazenados: título, corpo, data, autor e comentários

### 💬 Comentários
- Vinculados aos posts
- Contém texto, data e autor

## 🚀 Como Executar

### Pré-requisitos
- Java 17+
- MongoDB
- Maven

### Passos
1. Clone o repositório
2. Configure o MongoDB (porta padrão 27017)
3. Execute:
bash
mvn spring-boot:run
   
## 📡 Endpoints

### Usuários
GET /users - Lista todos usuários
GET /users/{id} - Busca usuário por ID
POST /users - Cria usuário
PUT /users/{id} - Atualiza usuário
DELETE /users/{id} - Remove usuário
GET /users/{id}/posts - Lista posts do usuário
### Posts
GET /posts/{id} - Busca post por ID
GET /posts/titlesearch?text={texto} - Busca posts por título
GET /posts/fullsearch?text={texto}&minDate={data}&maxDate={data} - Busca avançada

## 📊 Modelos de Dados

### Usuário
json
{
"id": "string",
"name": "string",
"email": "string"
}

### Post
json
{
"id": "string",
"date": "date",
"title": "string",
"body": "string",
"author": {
"id": "string",
"name": "string"
},
"comments": [
{
"text": "string",
"date": "date",
"author": {
"id": "string",
"name": "string"
}
}
]
}


## 🔧 Configuração
O MongoDB deve estar rodando em:
mongodb://localhost:27017/workshop_mongo


## 🗃️ Dados de Teste
A aplicação inclui uma configuração inicial com:
- 3 usuários (Maria, Alex e Bob)
- 2 posts
- 3 comentários

## 🔍 Tratamento de Erros
- Implementa handler global para exceções
- Retorna respostas padronizadas em caso de erro
- Status HTTP apropriados para cada situação

## 🏗️ Arquitetura
- `domain`: Entidades
- `dto`: Objetos de transferência
- `repository`: Interfaces MongoDB
- `resources`: Controllers REST
- `services`: Regras de negócio
- `config`: Configurações
- `util`: Classes utilitárias
