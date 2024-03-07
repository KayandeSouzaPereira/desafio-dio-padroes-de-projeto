
# Desafio de Padrões de Projeto DIO

Este e um projeto de api com o tema de desafio de design patterns. 
Para o projeto foi empregado diversos padrões de projeto. 

### Ideia do projeto

Um prototipo de api de E-commerce com as funções:
- Listagem de produtos.
- Seleção de 1 unico tipo de produto por compra.
- Consumo deste produto.
## Stack utilizada

- Java
- Springboot


## Padrões de Projeto utilizados

- Abstract Factory (Para Objetos do tipo Compra)
- Singleton (Nas anotações do tipo @Autowired)
- Prototype (Para Objetos do tipo Produto)
- ChainOfResponsibility (Para a função de retorno das etapas de transporte)
- Facade (Para o enriquecimento de produtos consumidos)
- Bridge (Para Objetos do tipo Consumo) 

## Instalação local

Instale Projeto em sua maquina local.

```bash
  git clone branch_url
  
```
## Documentação

A documentação Swagger pode ser encontrada ao iniciar o projeto pelo endpoint `/swagger-ui/index.html`.

## Autores

- [@kayandesouza](https://github.com/KayandeSouzaPereira) Desenvolvedor do App


