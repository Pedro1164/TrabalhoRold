# Sistema de Gerenciamento de Links - Versão 4.0

## Descrição do Projeto

O Sistema de Gerenciamento de Links permite que os usuários armazenem, editem, excluam, listem e filtrem links por categoria. A aplicação é baseada em uma interface de linha de comando (CLI) e armazena os links localmente em memória (não persistente) enquanto o programa estiver em execução.

## Funcionalidades

### Adicionar Link
- O usuário pode adicionar um novo link fornecendo a URL, descrição e categoria do link.
- O link é adicionado à lista de links na memória.

### Listar Links
- Exibe todos os links armazenados, mostrando a URL, descrição e a categoria.
- Caso não haja links cadastrados, o sistema informa que nenhum link foi encontrado.

### Filtrar Links por Categoria
- Permite que o usuário filtre os links cadastrados por categoria, exibindo apenas os links relacionados à categoria informada.
- Caso não haja links com a categoria informada, o sistema avisa que nenhum link foi encontrado.

### Remover Link
- Permite que o usuário remova um link específico fornecendo seu número na lista de links cadastrados.
- O link correspondente é removido da memória.

### Editar Link
- O sistema solicita ao usuário que digite o número do link que deseja editar.
- O usuário pode atualizar a URL, descrição e categoria do link. Se algum campo não for alterado, o valor antigo é mantido.
- O link é atualizado na lista e salvo no arquivo.

### Classificar Links
- Os links são classificados por categoria.
- A lista de links é exibida na nova ordem.

### Persistência de Dados
- Os links são salvos em um arquivo `links.txt` no formato `URL;Descrição;Categoria`.
- Ao iniciar o programa, os links são carregados do arquivo.
- Ao adicionar, editar ou remover links, o arquivo é atualizado.

## Estrutura do Projeto

```plaintext
SistemadeLinks/
│
├── Link.java               // Representa um link com URL, descrição e categoria.
├── SistemadeLinks.java     // Gerencia os links e interage com o usuário, incluindo funcionalidades de persistência, edição e classificação.
└── Main.java               // Contém o método principal para executar o sistema.
