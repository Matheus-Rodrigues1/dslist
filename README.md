# DSList


- O projeto DSList é uma lista de jogos em Java com uma API RESTful, que utiliza conceitos como sistemas web e recursos, banco de dados PostgreSQL, Docker e Railway. Ele foi desenvolvido com o objetivo de demonstrar boas práticas de programação em Java, seguindo os padrões de arquitetura Rest e utilizando ferramentas modernas para auxiliar no processo de desenvolvimento, homologação e deploy em nuvem. A lista de jogos é armazenada no banco de dados PostgreSQL e a API RESTful permite que os usuários possam realizar operações de CRUD (criar, ler, atualizar e deletar) na lista de jogos. O projeto também possui um ambiente de homologação local com Docker Compose e um processo de deploy automatizado utilizando o serviço de hospedagem em nuvem Railway.

- Importante ressaltar que este projeto foi montado a partir do curso "Intensivão Java Spring" do professor Nelio Alves.

---
### Recursos e conceitos utilizados:
- Sistemas web e recursos
- Cliente/servidor, HTTP, JSON
- Padrão Rest para API web
- Estruturação de projeto Spring Rest
- Entidades e ORM
- Database seeding
- Padrão camadas
- Controller, service, repository
- Padrão DTO
- Relacionamentos N-N
- Classe de associação, embedded id
- Consultas SQL no Spring Data JPA
- Projections
- Ambiente local com Docker Compose
- Processo de homologação local
- Configuração de CORS
- Deploy em nuvem com Railway
- Teste de requisições com Postman

---
### Tecnologias utilizadas:
- Java
- Spring Boot
- PostgreSQL
- Docker
- Docker Compose
- Maven
- Railway

---
### Como instalar e rodar a aplicação na máquina local:
* Para instalar e rodar a aplicação na máquina local, siga os passos abaixo:

##### Clone o repositório do projeto para a sua máquina local utilizando o comando:
- git clone https://github.com/seu-usuario/dslist.git
  
##### Clone o repositório do projeto para a sua máquina local utilizando o comando:
- cd dslist
  
##### Execute o comando abaixo para criar a imagem Docker do projeto:
- docker-compose build
  
##### Após a criação da imagem, execute o comando abaixo para subir os containers do projeto:
-  docker-compose up

---
### Endpoints disponíveis:
  
| Endpoint | Método HTTP | Descrição |
| -------- | ---------- | --------- |
| /games   | GET        | Retorna uma lista com todos os jogos cadastrados |
| /games/{id} | GET     | Retorna um jogo específico cadastrado no banco de dados, buscado pelo seu ID |
| /lists/{id}/games | GET | Retorna todos os jogos cadastrados em uma lista específica |
| /lists/{id}/replacement | POST | Realiza a alteração da ordem dos jogos conforme os movimentos do usuário |



