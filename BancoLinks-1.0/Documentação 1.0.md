# Documentação do Sistema de Gerenciamento de Links

## Descrição do Projeto

O Sistema de Gerenciamento de Links permite que os usuários armazenem, editem, excluam, listem e pesquisem links por assunto. A aplicação é baseada em uma interface de linha de comando (CLI) e armazena os links localmente em memória (não persistente) enquanto o programa estiver em execução.

O sistema inclui funcionalidades para adicionar, listar e gerenciar links, facilitando o armazenamento e a pesquisa de URLs importantes, organizados por assunto.

## Funcionalidades

### 1. Adicionar Link
- O usuário pode adicionar um novo link fornecendo a URL, descrição e assunto do link.
- O link é adicionado à lista de links na memória.

### 2. Listar Links
- Exibe todos os links armazenados, mostrando a URL, descrição e o assunto.
- Caso não haja links cadastrados, o sistema informa que nenhum link foi encontrado.

### 3. Menu Interativo
- O sistema exibe um menu interativo que permite ao usuário escolher entre adicionar um link, listar links ou sair do sistema.

## Estrutura do Projeto

```plaintext
SistemadeLinks/
│
├── Link.java               // Classe responsável por representar um link com URL, descrição e assunto.
├── SistemadeLinks.java     // Classe principal que gerencia os links e interage com o usuário.
└── Main.java               // Classe que contém o método principal (main) para executar o sistema.
