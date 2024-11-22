# Sistema de Gerenciamento de Links - Versão 2.0

## Funcionalidades Adicionadas

### Filtragem de Links por Assunto
Agora, o sistema permite que o usuário filtre os links cadastrados por assunto. Ao escolher a opção "Filtrar Links por Assunto" no menu, o usuário pode digitar um assunto e visualizar apenas os links relacionados a ele.

## Como Funciona a Filtragem:
- O sistema solicita ao usuário que digite um assunto para filtrar os links.
- O sistema percorre a lista de links e exibe apenas aqueles que possuem o assunto fornecido.
- Caso não haja links com o assunto informado, o sistema avisa ao usuário que nenhum link foi encontrado.

## Mudanças na Estrutura do Projeto
O código foi atualizado para incluir a filtragem de links por assunto. Além disso, o menu do sistema foi modificado para incluir a nova opção de filtragem.

### Estrutura Atualizada:
```plaintext
SistemadeLinks/
│
├── Link.java               // Representa um link com URL, descrição e assunto.
├── SistemadeLinks.java     // Gerencia os links e interage com o usuário, incluindo a nova funcionalidade de filtragem.
└── Main.java               // Contém o método principal para executar o sistema.

