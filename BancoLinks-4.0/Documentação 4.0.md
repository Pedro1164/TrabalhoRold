# Sistema de Gerenciamento de Links - Versão 4.0

## Funcionalidades Adicionadas

### Persistência de Dados
Agora, o sistema salva os links em um arquivo (`links.txt`). Os links são carregados do arquivo ao iniciar o programa e salvos novamente ao adicionar, editar ou remover links.

### Edição de Links
Foi adicionada a funcionalidade de editar links. O usuário pode modificar a URL, descrição e categoria de links existentes.

### Classificação de Links
Adicionada a funcionalidade para classificar links por categoria, permitindo uma melhor organização e visualização.

## Como Funciona a Persistência de Dados
- Os links são salvos em um arquivo `links.txt` no formato `URL;Descrição;Categoria`.
- Ao iniciar o programa, os links são carregados do arquivo.
- Ao adicionar, editar ou remover links, o arquivo é atualizado.

## Como Funciona a Edição de Links
- O sistema solicita ao usuário que digite o número do link que deseja editar.
- O usuário pode atualizar a URL, descrição e categoria do link. Se algum campo não for alterado, o valor antigo é mantido.
- O link é atualizado na lista e salvo no arquivo.

## Como Funciona a Classificação de Links
- Os links são classificados por categoria.
- A lista de links é exibida na nova ordem.

## Correções e Melhorias

### Fechamento do Scanner
- Foi corrigido um problema de vazamento de recursos onde o objeto `Scanner` não estava sendo fechado após o uso. Agora, o `Scanner` é fechado corretamente após cada operação, garantindo que não haja vazamentos de recursos.

### Métodos Setters
- Adicionados os métodos `setUrl`, `setDescricao` e `setCategoria` na classe `Link` para permitir a edição dos atributos dos links.

### Estrutura do Menu
- Ajustado o menu para que haja uma linha em branco antes e depois do menu, melhorando a clareza e organização da interface.

## Mudanças na Estrutura do Projeto
O código foi atualizado para incluir a persistência de dados, edição de links, classificação por categoria, e outras correções e melhorias.

### Estrutura Atualizada:
```plaintext
SistemadeLinks/
│
├── Link.java               // Representa um link com URL, descrição e categoria.
├── SistemadeLinks.java     // Gerencia os links e interage com o usuário, incluindo funcionalidades de persistência, edição e classificação.
└── Main.java               // Contém o método principal para executar o sistema.

