

## 👨‍💻 Integrantes
- Lucas Miranda Leite RM:555161
- Gusthavo Daniel De Souza RM:554681
- Guilhereme Damasio Roselli RM:555873

# 🚀 Sistema de Rastreamento de Motos com RFID

## 📌 Descrição
Este projeto é um **MVP** desenvolvido em **Java Spring Boot** para o rastreamento de motos em pátios, utilizando **etiquetas RFID**.  
O sistema registra a passagem de motos por leitores RFID, vincula os eventos às filiais e permite consultas via API REST.

---

## 🎯 Objetivo
- Monitorar entradas e saídas de motos em tempo real.
- Garantir rastreabilidade e organização em filiais.
- Fornecer uma API clara e documentada para integração.

---

## 🛠️ Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database (memória) / Oracle (opcional)**
- **Swagger/OpenAPI** para documentação
- **Maven**

---

## 📂 Estrutura do Projeto
```
src/main/java/com/example/rfidtracking
 ├── config/              # Configuração do ModelMapper
 ├── controller/          # Endpoints REST
 ├── dto/                 # Data Transfer Objects
 ├── exception/           # Tratamento de erros
 ├── model/               # Entidades JPA (Moto, Filial, RegistroRFID)
 ├── repository/          # Interfaces do Spring Data
 └── RfidTrackingApplication.java
```

---

## 🔑 Funcionalidades
- **Moto**
  - Criar, listar, atualizar e remover motos.
- **Filial**
  - Cadastro de filiais e listagem.
- **RegistroRFID**
  - Registro de passagem de motos por leitores RFID com data/hora.
  - Consultas por moto ou filial.

---

## 📡 Endpoints principais
| Método | Endpoint            | Descrição                          |
|--------|---------------------|------------------------------------|
| POST   | `/motos`            | Cadastrar nova moto                |
| GET    | `/motos`            | Listar todas as motos              |
| POST   | `/filiais`          | Cadastrar filial                   |
| GET    | `/filiais`          | Listar filiais                     |
| POST   | `/registros`        | Registrar passagem de RFID         |
| GET    | `/registros`        | Listar registros                   |

---

## ▶️ Como executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-repo/javasprint3v1.git
   cd javasprint3v1
   ```
2. Compile e rode com Maven:
   ```bash
   mvn spring-boot:run
   ```
3. Acesse a documentação da API em:
   ```
   http://localhost:8080/swagger-ui.html
   ```

---
