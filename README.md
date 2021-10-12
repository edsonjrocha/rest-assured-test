## ESD21 - Automated Software Testing / Exercicio Rest Assured

## Objetivo

Escolher uma API para consumir, utilizando as opções da lista https://github.com/public-apis/public-apis

Foi escolhida a API ViaCep, que tem o objetivo de consultar Códigos de Endereçamento Postal (CEP) do Brasil
 
Crie um projeto com RestAssured e JUnit   
Crie um teste de sucesso validando o http status code e o conteúdo retornado pela API com Assert   
Crie um teste de falha validando o http status code com Assert  
Subir o código no Github e enviar no classroom (atividade individual ou em grupo)  


## Observação

O teste foi realizado utilizando o exemplo do próprio site da API https://viacep.com.br/

CEP utilizado no teste: 01001000

Resultado esperado para o teste: 

{  
  "cep": "01001-000",   
  "logradouro": "Praça da Sé",  
  "complemento": "lado ímpar",  
  "bairro": "Sé",  
  "localidade": "São Paulo",  
  "uf": "SP",  
  "ibge": "3550308",  
  "gia": "1004",  
  "ddd": "11",  
  "siafi": "7107"  
}
