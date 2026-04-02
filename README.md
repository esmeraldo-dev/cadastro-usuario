# 🚀 Projeto Cadastro de Usuário (CRUD)

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.1-brightgreen)
![Maven](https://img.shields.io/badge/Maven-Build-blue)

Bem-vindo ao meu laboratório! Este é um projeto **Backend** desenvolvido em **Java 21** utilizando o ecossistema **Spring Boot**. O objetivo aqui é colocar em prática os conceitos de persistência de dados, APIs RESTful e as melhores práticas de desenvolvimento — servindo como base estrutural para projetos mais robustos do portfólio.

O sistema realiza o gerenciamento completo de usuários com validações de campos, estrutura em camadas (MVC) e persistência via JPA, sendo ideal para entender o ciclo completo de um CRUD em ambiente Spring.

---

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** Java 21
- **Framework:** Spring Boot
- **Persistência:** Spring Data JPA
- **Banco de Dados:** H2 Database (In-memory para facilitar testes rápidos)
- **Produtividade:** Lombok
- **Web:** Spring Web (MVC)
- **IDE Sugerida:** IntelliJ IDEA
- **Build Tool:** Maven (via Maven Wrapper `mvnw`)

---

## 🎯 Objetivo do Projeto

Este projeto tem como principais objetivos:

- Praticar o desenvolvimento de APIs REST com Spring Boot
- Aplicar boas práticas de backend (separação de camadas, DTOs, tratamento de erros)
- Consolidar conhecimentos em Java e persistência com JPA/Hibernate
- Criar uma base de portfólio profissional documentada

---

## 📡 Endpoints da API

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `POST` | `/usuarios` | Cadastra um novo usuário (valida campos obrigatórios) |
| `GET` | `/usuarios` | Lista todos os usuários cadastrados |
| `GET` | `/usuarios/{id}` | Busca um usuário específico por ID |
| `PUT` | `/usuarios/{id}` | Atualiza os dados de um usuário existente |
| `DELETE` | `/usuarios/{id}` | Remove um usuário do sistema |

### Exemplo de payload para cadastro (`POST /usuarios`):

```json
{
  "nome": "Vinícius Esmeraldo",
  "email": "vinicius@email.com",
  "cpf": "123.456.789-00"
}
```

---

## 📂 Estrutura do Projeto

```
cadastro-usuario/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/vinicius/cadastro_usuario/
│   │   │       ├── CadastroUsuarioApplication.java  # Classe principal (@SpringBootApplication)
│   │   │       ├── controller/     # Camada de exposição (Endpoints REST)
│   │   │       ├── model/          # Entidades que representam o Banco de Dados (JPA)
│   │   │       ├── repository/     # Interfaces para persistência (Spring Data JPA)
│   │   │       └── service/        # Camada de regras de negócio
│   │   └── resources/
│   │       └── application.properties  # Configurações (Banco H2, porta, etc.)
│   └── test/
├── mvnw.cmd                        # Wrapper do Maven para Windows
└── pom.xml                         # Dependências e Plugins
```

---

## 🚀 Como Rodar o Projeto no Windows

### Pré-requisitos

- **JDK 21** instalado
- **IntelliJ IDEA** (Community ou Ultimate)

### Passo a Passo

**1. Clone o repositório:**

```bash
git clone https://github.com/esmeraldo-dev/cadastro-usuario.git
cd cadastro-usuario
```

**2. Abra no IntelliJ:** `File > Open` e selecione a pasta do projeto.

**3. Aguarde o Maven** baixar as dependências automaticamente (aquele momento de tomar um café ☕).

**4. Execute a aplicação:**

Encontre a classe `CadastroUsuarioApplication` (anotada com `@SpringBootApplication`) e pressione `Shift + F10`.

Ou via terminal (PowerShell/CMD):

```bash
.\mvnw.cmd spring-boot:run
```

**5. Acesse o console H2** para inspecionar os dados em tempo real:

🔗 http://localhost:8080/h2-console

```
JDBC URL: jdbc:h2:mem:testdb
User:     sa
Senha:    (deixe em branco)
```

---

## 🧪 Rodando os Testes

```bash
.\mvnw.cmd test
```

---

## ☕ Considerações Finais

Este projeto é um ponto de partida — um "laboratório" onde os fundamentos do desenvolvimento backend com Spring Boot foram solidificados antes de partir para projetos com maior complexidade (como o [VaultCore](https://github.com/esmeraldo-dev/vaultcore) e o [EcoDriver](https://github.com/esmeraldo-dev/ecodriver)).

Se você encontrar algum bug ou tiver sugestões de melhoria, sinta-se à vontade para abrir uma issue!

---

## 👨‍💻 Autor

**Vinícius Esmeraldo**  
*Desenvolvedor Backend Java*

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/viniciusesmeraldo)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/esmeraldo-dev)
