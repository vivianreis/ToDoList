🎯 Projeto CRUD To-Do List
----------------------------------------------------------
Repositório para estudos projeto de uma To-Do List usando Spring + Heroku
Com este projeto é possível:

- Criar tarefas.
- Listar todas as tarefas.
- Listar tarefas por Id
- Atualizar tarefas
- Deletar tarefas

IMPORTANTE❗
Este projeto é um projeto de estudo usando a playlist da Kamila de Fátima no Youtube </br>
Link: https://www.youtube.com/watch?v=un7EgWqgNMs&list=PL_pqVN-1MnwMScqW3AnPR0oA2SiBy0d2_</br>
Sigam a Kamila de Fátima aqui no Github também: https://github.com/Kamilahsantos </br>

⚙ Tecnologias utilizadas
-----------------------------------------------------------
- Linguagem: Java 17.
- Spring.
- Banco de dados: De início H2 que é um banco em memória (depois alterado para PostgreSQL).
- Deploy no Heroku.
- Versionamento: Github.

📝 Dependências principais
----------------------------------------------------------
- Spring Web: Para criar uma api usando spring mvc. (usa o apache contêiner incorporado por padrão) </br>
- Spring Data Jpa: Para persistir dados em repositórios SQL com a API Java Persistence usando Spring Data e Hibernate. </br>
- PostgreSQL: Foi utilizado banco de dados PostgreSQL. </br>
- Spring Fox Swagger 2 e Spring Swagger UI: SpringFox é uma ferramenta open source ela foi desenvolvida para integrar projetos Spring Boot com a especificação Swagger (O Swagger é uma aplicação open source que auxilia os desenvolvedores a definir, criar, documentar e consumir APIs REST). E para interagir com a configuração, também é necessário adicionar a dependência que fornece o Swagger UI.

📄 Camadas do projeto
----------------------------------------------------------
- Model: Classe responsável pela abstração dos objetos e tabelas no banco de dados. </br>
- Repository: Interface responsável pela comunicação direta com o banco de dados. </br>
- Service: Classe responsável por toda regra de negócio e tratativa de dados, sempre seguindo o modelo de negócio da aplicação. </br>
- Controller: É a camada responsável por manipular todas as requisições feitas do lado de fora da nossa API, essas requisições são feitas através de URL's seguindo o protocolo HTTP. </br>
- Docs: Todas as configurações do Swagger devem ser definidas na classe SwaggerConfiguration.

♾️ Deploy - Heroku
----------------------------------------------------------
O que é Heroku? Heroku é uma PaaS (Plataforma como um Serviço) que permite hospedagem, configuração, testagem e publicação de projetos virtuais na nuvem. </br>

https://dashboard.heroku.com/apps/todolist-kamilacodevivian </br>
https://todolist-kamilacodevivian.herokuapp.com/swagger-ui.html#/task-controller

🚀 Como compilar o projeto na sua máquina
----------------------------------------------------------
De um git clone nesse repositório:

git clone https://github.com/vivianreis/toDoList.git </br>

No caso utilizei a IDE Intellij vá na classe principal e clique na seta Run.

Caso tenha dúvidas de comandos no Github tenho um repositório com algumas dicas: https://github.com/vivianreis/cursoGit
