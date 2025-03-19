# Relatório do Projeto - Sistema de Cadastro Jardim Viver School

## 1. Visão Geral
Este projeto implementa um sistema de cadastro para os pais dos alunos da escola Jardim Viver, desenvolvido pela empresa TechZ. O sistema consiste em um formulário que captura informações essenciais dos pais dos alunos.

## 2. Estrutura do Projeto

### 2.1 Arquivos do Projeto
- `index.html`: Interface do usuário web
- `MainActivity.java`: Atividade principal do Android
- `ParentDTO.java`: Classe de transferência de dados

### 2.2 Tecnologias Utilizadas
- Frontend:
  - HTML5
  - Tailwind CSS (via CDN)
  - Font Awesome (ícones)
  - Google Fonts (tipografia)
- Backend:
  - Java para Android
  - Padrão DTO (Data Transfer Object)

## 3. Detalhamento dos Componentes

### 3.1 Interface do Usuário (index.html)
- Design moderno e responsivo
- Formulário com campos:
  - Nome
  - Sobrenome
  - Idade
  - Email
  - Endereço
- Características:
  - Validação de campos
  - Feedback visual
  - Cores personalizadas
  - Ícones intuitivos
  - Layout adaptativo

### 3.2 Classe DTO (ParentDTO.java)
- Implementa o padrão Data Transfer Object
- Atributos:
  - nome (String)
  - sobrenome (String)
  - email (String)
  - idade (int)
  - endereco (String)
- Métodos:
  - Construtores
  - Getters e Setters

### 3.3 Activity Android (MainActivity.java)
- Implementa a lógica de interface Android
- Funcionalidades:
  - Inicialização de componentes UI
  - Manipulação de eventos
  - Integração com ParentDTO
  - Preparação para persistência de dados

## 4. Funcionalidades Implementadas
1. Captura de dados do formulário
2. Validação de campos
3. Transferência de dados via DTO
4. Interface responsiva
5. Preparação para persistência em banco de dados

## 5. Instruções de Uso

### 5.1 Requisitos
- JDK (Java Development Kit)
- Android Studio ou VSCode com extensões Android
- Navegador web moderno

### 5.2 Configuração do Ambiente
1. Clone o repositório
2. Abra o projeto no Android Studio ou VSCode
3. Configure o SDK Android
4. Execute o build do projeto

### 5.3 Execução
- Frontend Web:
  ```bash
  python3 -m http.server 8000
  ```
  Acesse: http://localhost:8000/index.html

- Android:
  1. Abra o projeto no Android Studio
  2. Execute em um emulador ou dispositivo físico

## 6. Considerações Finais
O sistema foi desenvolvido seguindo boas práticas de programação e design moderno. A implementação permite fácil manutenção e extensão futura, com possibilidade de adicionar novas funcionalidades conforme necessário.

## 7. Próximos Passos
- Implementar persistência em banco de dados
- Adicionar autenticação de usuários
- Implementar dashboard administrativo
- Desenvolver relatórios de cadastros

---
Data: Março 2024
Desenvolvido por: TechZ