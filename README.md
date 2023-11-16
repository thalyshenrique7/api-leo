# API Rest - Cadastro de Usuário

### Disciplina Cliente/Servidor P4

> Grupo:
+ Levi Oliveira
+ Leonardo Rafael
+ Thalys Henrique

#### URLs:

+ GET http://localhost:8081/api/usuario
+ POST http://localhost:8081/api/usuario
+ DELETE http://localhost:8081/api/usuario
+ PUT http://localhost:8081/api/usuario

#### Exemplos:

> GET http://localhost:8081/api/usuario

#### Retorno:

{
    "id": 1,
    "nome": "Usuario Teste",
    "cpf": "123",
    "rg": "456",
    "dataCriacao": "2023-11-16T21:52:02.886+00:00"
}

> POST http://localhost:8081/api/usuario

#### Parâmetros:
+ nome: string (obrigatório)
+ cpf: string (obrigatório)
+ rg: string (obrigatório)

> DELETE http://localhost:8081/api/usuario

#### Parâmetros:
+ id: long (obrigatório)

> PUT http://localhost:8081/api/usuario

#### Parâmetros:
+ id: long (obrigatório)
+ nome: string (obrigatório)
+ cpf: string (obrigatório)
+ rg: string (obrigatório)

> Ferramentas utilizadas:

<table>
<tr align="center">
<td>Java</td>
<td>Spring Boot</td>
<td>H2 Database</td>
</tr>

<tr align="center">
<td>17</td>
<td>3.1.5</td>
<td>-</td>
</tr>
</table>
