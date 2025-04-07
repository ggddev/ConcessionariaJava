# 🚗 ConcessionariaJava

**ConcessionariaJava** é um projeto em Java que simula o processo de **compra e venda de veículos** em uma concessionária. Ele foi desenvolvido para praticar conceitos fundamentais da linguagem, como orientação a objetos, uso de `ArrayList`, `Stack`, `Scanner` e manipulação de datas com a classe `Year`.

---

## 🧾 Descrição

O sistema funciona através do terminal e permite ao usuário registrar **vendas de veículos** (informando dados como modelo, ano, cor, valor, etc.) e também visualizar o estoque atual da concessionária para realizar uma **compra**.

---

## 🛠️ Funcionalidades

- Registrar veículos para venda
- Analisar se o valor do veículo permite a compra imediata ou negociação
- Armazenar veículos comprados em uma pilha (`Stack`)
- Visualizar veículos disponíveis
- Simulação de cadastro e listagem com base em entrada do usuário

---

## 📁 Estrutura do Projeto

O projeto está organizado em um pacote chamado `ConcessionariaJava`, com as seguintes classes:

### 🔹 `main`
Classe principal que contém a lógica de interação com o usuário. Permite selecionar entre compra ou venda e gerencia o fluxo principal do programa.

### 🔹 `Venda`
Representa uma venda de veículo. Contém informações como:
- Nome do dono
- Modelo (como uma `ArrayList`)
- Ano de fabricação (usando `Year`)
- Cor
- Estado (novo ou usado)
- Valor

### 🔹 `ListaDeCarros`
Classe que armazena a lista de veículos da concessionária em uma `Stack<ArrayList<String>>`, facilitando a manipulação do estoque.

### 🔹 `Compra`
Classe preparada para uso futuro. Pode ser estendida para registrar compras de clientes.

---


## ▶️ Como Executar

1. Tenha o **JDK 17 ou superior** instalado.
 
2. Compile os arquivos:

```bash
javac ConcessionariaJava/*.java
```
3. Execute o programa:
```
java ConcessionariaJava.main
 ```


## 📌 Requisitos
- Java 17+
- Terminal (ou IDE como Eclipse, IntelliJ ou VS Code)


## 💡 Exemplos de Uso
- Venda de veículo com valor abaixo de R$ 10.000:
-   O sistema compra automaticamente.
   
- Venda com valor maior que R$ 10.000:
-   O sistema informa que entrará em negociação.

- Compra:
-   O usuário visualiza os veículos no estoque e pode informar qual deseja.
-   O sistema irá mostrar as informações do veículo (KMs rodados, ano de fabricação, estado e valor).

## 📚 Aprendizados 
Este projeto foi útil para aplicar conceitos como: 
- Programação orientada a objetos (POO)
- Manipulação de ```ArrayList``` e ```Stack```
- Leitura de entrada com ```Scanner```
- Estruturação e reutilização de código com múltiplas classes
- Uso de ```java.time.Year``` para trabalhar com anos


## 🧪 Melhorias futuras
- Implementar a classe ```Compra```
- Validar entradas do usuário
- Criar persistência de dados (arquivo ou banco)
- Interface gráfica com JavaFX ou Swing


## 🤝 Contribuilção
Este projeto foi feito com fins educacionais, mas sugestões são bem-vindas!


## 📄 Licença
Código livre para uso pessoal e acadêmico.
