
# CP02-Digital API Documentation

## Autenticação

### Registro de Usuário

POST /api/registro

`{
    "username": "Usuario",
    "password": "12345678"
}`

### Login

POST /api/login

`{
    "username": "Usuario",
    "password": "12345678"
}`

Esta requisição retornará um token. Utilize este token para autorização das requisições subsequentes. Insira o token no Postman (ou outro aplicativo) na seção de Autorização, utilizando o tipo "Bearer Token".

## Tarefas

### Listar Todas as Tarefas

GET /api/task

### Obter uma Tarefa Específica

GET /api/task/1

### Criar uma Nova Tarefa

POST /api/task

`{
    "id": 1,
    "title": "Título 1",
    "description": "Descrição 1",
    "status": "aberto",
    "dueDate": "2023-11-03T10:30:00.000Z"
}`

### Atualizar uma Tarefa Existente

PUT /api/task


`{
    "id": 1,
    "title": "Título 2",
    "description": "Descrição 1",
    "status": "aberto",
    "dueDate": "2023-11-03T10:30:00.000Z"
}`

### Deletar uma Tarefa

DELETE /api/task/1
