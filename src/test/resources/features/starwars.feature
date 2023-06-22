# language: pt

Funcionalidade: Get na api de Star Wars

  @GET
  Esquema do Cenário: Get na api de Star Wars
    Dado que fiz o GET na api de Star Wars
    Entao recebo um codigo <CODIGO>
    E realizo as validacoes de nome <NOME> e altura <ALTURA>
    Exemplos:
      | CODIGO    | NOME     | ALTURA  |
      | 200       | Luke Skywalker | 172  |

  @POST
  Esquema do Cenario: Post na api de req
    Dado que fiz o POST na api de Star Wars com nome <NOME>, altura <ALTURA> e peso <PESO>
    Entao recebo um codigo <CODIGO>
    Exemplos:
      | CODIGO    | NOME | ALTURA | PESO |
      | 201       | Johnny | 175  | 78   |