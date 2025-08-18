# 🔗 API Encurtador de URL

![Java](https://img.shields.io/badge/Java-17-red?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green?logo=springboot)
![Python](https://img.shields.io/badge/Python-3.x-blue?logo=python)
![License](https://img.shields.io/github/license/Dev1Nate/API-Encurtador-De-URL)
![Build](https://img.shields.io/badge/build-passing-brightgreen)

Uma API simples para encurtar URLs, desenvolvida em **Java (Spring Boot)** e integrando com **Python** para geração do link encurtado.

---

## ⚙️ Tecnologias Utilizadas
- **Java 17+**  
- **Spring Boot** (Web, REST)  
- **Python 3.x** (script `shortener.py`)  
- **Maven** (build e dependências)  

---

## 🚀 Funcionalidades
- Receber uma URL e gerar um link encurtado  
- Tratar exceções e retornar mensagens claras em caso de erro  
- Estrutura simples e extensível para futuros recursos (ex: redirecionamento, estatísticas de uso)  

---

## 📌 Estrutura do Projeto
```
src/
 └── main/
     ├── java/com/Encurtador/API/
     │   ├── Resource/        → Controllers REST
     │   ├── Services/        → Regras de negócio
     │   └── Exceptions/      → Tratamento de erros globais
     └── resources/python/
         └── shortener.py     → Script Python que gera a URL encurtada
```

---

## 🔑 Endpoints

### 1️⃣ Encurtar URL
- **POST** `/url`  
- **Body (JSON):**
```json
"https://exemplo.com/minha-pagina"
```

- **Resposta:**
```json
"http://encurtado.com/abc123"
```

---

## 🛠️ Como Executar Localmente

### Pré-requisitos
- [Java 17+](https://adoptium.net/)  
- [Maven](https://maven.apache.org/)  
- [Python 3.x](https://www.python.org/downloads/) instalado e acessível no `PATH`  

### Passos
1. Clonar o repositório:
   ```bash
   git clone https://github.com/Dev1Nate/API-Encurtador-De-URL.git
   cd API-Encurtador-De-URL
   ```
2. Buildar o projeto:
   ```bash
   mvn clean install
   ```
3. Executar a API:
   ```bash
   mvn spring-boot:run
   ```
4. Testar no **Postman** ou **cURL**.

### Exemplo com cURL
```bash
curl -X POST http://localhost:8080/url      -H "Content-Type: application/json"      -d "\"https://google.com\""
```

Resposta esperada:
```json
"http://encurtado.com/xyz789"
```

---

## ⚠️ Tratamento de Erros
Se ocorrer qualquer falha, a API retorna:
```json
Ocorreu um erro interno: [mensagem do erro]
```

---

## 📜 Licença
Distribuído sob a licença **GPL-3.0**. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## ✨ Melhorias Futuras
- [ ] Criar endpoint de **redirecionamento** (`GET /{hash}`)  
- [ ] Persistência em banco de dados para histórico de URLs  
- [ ] Estatísticas de acessos  
- [ ] Frontend simples para interação  

---

## 👨‍💻 Autor
Desenvolvido por **[Dev1Nate](https://github.com/Dev1Nate)** 🚀
