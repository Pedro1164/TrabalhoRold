# Sistema de Gerenciamento de Links - Versão 3.0

## Funcionalidades Adicionadas

### Substituição de Assunto por Categoria
Agora, o campo "assunto" foi substituído por "categoria". Todas as referências ao termo "assunto" nos métodos e atributos foram atualizadas para "categoria".

### Remoção de Links Específicos
Foi adicionada a funcionalidade de remover links específicos. O usuário pode fornecer o número do link na lista de links cadastrados e removê-lo da memória.

## Como Funciona a Filtragem por Categoria
- O sistema solicita ao usuário que digite uma categoria para filtrar os links.
- O sistema percorre a lista de links e exibe apenas aqueles que possuem a categoria fornecida.
- Caso não haja links com a categoria informada, o sistema avisa ao usuário que nenhum link foi encontrado.

## Como Funciona a Remoção de Links
- O sistema solicita ao usuário que digite o número do link que deseja remover.
- O link correspondente é removido da memória, caso o número seja válido.
- Caso o número seja inválido, o sistema avisa ao usuário para tentar novamente.

## Mudanças na Estrutura do Projeto
O código foi atualizado para incluir a substituição de "assunto" por "categoria" e a funcionalidade de remoção de links.

### Estrutura Atualizada:
```plaintext
SistemadeLinks/
│
├── Link.java               // Representa um link com URL, descrição e categoria.
├── SistemadeLinks.java     // Gerencia os links e interage com o usuário, incluindo a funcionalidade de filtrar por categoria e remover links.
└── Main.java               // Contém o método principal para executar o sistema.

