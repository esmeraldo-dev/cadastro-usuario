# 🚀 Projeto Cadastro de Usuário (CRUD)

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.1-brightgreen)
![Maven](https://img.shields.io/badge/Maven-Build-blue)

Bem-vindo ao meu laboratório! Este é um projeto **Backend** desenvolvido em **Java 21** utilizando o ecossistema **Spring Boot 4.0.1**. O objetivo aqui é colocar em prática os conceitos de persistência de dados, APIs RESTful e as melhores práticas de desenvolvimento que venho estudando.

## 🛠️ Tecnologias e Ferramentas

Aqui está o que usei para dar vida a este projeto:

* **Linguagem:** Java 21
* **Framework:** Spring Boot 4.0.1
* **Persistência:** Spring Data JPA
* **Banco de Dados:** H2 Database (In-memory para facilitar os testes rápidos)
* **Produtividade:** Lombok 
* **Web:** Spring Web (MVC)
* **IDE Sugerida:** IntelliJ IDEA
* **Build Tool:** Maven (Via Maven Wrapper `mvnw`)

* ## 🎯 Objetivo do Projeto

Este projeto tem como principais objetivos:

- Praticar o desenvolvimento de APIs REST com Spring Boot
- Aplicar boas práticas de backend
- Consolidar conhecimentos em Java
- Criar um projeto real para portfólio profissional


## 📂 Estrutura do Projeto

Abaixo, a organização das pastas e arquivos principais, seguindo as convenções do Spring Boot:

```text
cadastro-usuario/
├── .idea/                          
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/vinicius/cadastro_usuario/
│   │   │       ├── CadastroUsuarioApplication.java  # Classe principal (Start da aplicação)
│   │   │       ├── controller/     # Camada de exposição (Endpoints REST)
│   │   │       ├── model/          # Entidades que representam o Banco de Dados (JPA)
│   │   │       ├── repository/     # Interfaces para persistência (Spring Data JPA)
│   │   │       └── service/        # Camada de regras de negócio (O coração do sistema)
│   │   └── resources/
│   │       ├── static/             
│   │       ├── templates/          
│   │       └── application.properties # Configurações (Banco H2, porta, etc.)
│   └── test/                       
├── .gitattributes                  
├── .gitignore                      
├── HELP.md                         
├── mvnw                            
├── mvnw.cmd                        # Wrapper do Maven para Windows
└── pom.xml                         # Dependências e Plugins
```
## 🚀 Como Rodar o Projeto no seu Windows

Se você clonou este repositório e quer ver a mágica acontecer no seu **IntelliJ**:

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/esmeraldo-dev/cadastro-usuario.git
    ```
2.  **Abra no IntelliJ:** `File -> Open` e selecione a pasta do projeto.
3.  **Aguarde o Maven:** O IntelliJ vai baixar as dependências automaticamente (aquele momento de tomar um café).
4.  **Execute a aplicação:** Encontre a classe principal (anotada com `@SpringBootApplication`) e dê aquele `Shift + F10` maroto.

Ou, se preferir o terminal (**PowerShell/CMD**):
```cmd
.\mvnw.cmd spring-boot:run
````

---

### ☕ Considerações Finais
Este projeto é um "work in progress". Se você encontrar algum bug ou tiver alguma sugestão (especialmente se for sobre como deixar o código mais limpo que o meu histórico de navegação), sinta-se à vontade para abrir uma issue ou mandar um pull request!

Desenvolvido por [Vinícius Esmeraldo](https://github.com/esmeraldo-dev).
