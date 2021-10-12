## ESD21 - Automated Software Testing / Exercicio Rest Assured

## Objetivo

Escolher uma API para consumir, utilizando as opções da lista https://github.com/public-apis/public-apis

Foi escolhida a API ViaCep, que tem o objetivo de consultar Códigos de Endereçamento Postal (CEP) do Brasil

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
