# Desafios de Programação Orientada a Objetos em Java 🧠☕️

Este repositório contém três desafios práticos desenvolvidos em Java utilizando os princípios da **Programação Orientada a Objetos (POO)**. Cada desafio representa um sistema independente com aplicação de classes, métodos, encapsulamento, e lógica de negócios.

## 🗂 Estrutura dos desafios

### 🔹 Desafio 1 – Sistema Bancário

Um sistema de simulação bancária que permite ao usuário:

- Criar uma conta bancária
- Consultar saldo e cheque especial
- Realizar depósitos e saques
- Pagar boletos
- Verificar se está utilizando o cheque especial e a taxa aplicada

#### 🧱 Classes:
- `App.java`: Interface de interação com o usuário
- `ContaBancaria.java`: Lógica e regras da conta bancária

---

### 🔹 Desafio 2 – Simulador de Carro

Sistema que simula o funcionamento básico de um carro:

- Ligar e desligar o carro (respeitando as regras de segurança)
- Acelerar e reduzir a velocidade
- Trocar marchas manualmente
- Verificar dados do carro e velocidade atual
- Virar o volante (esquerda ou direita)

#### 🧱 Classes:
- `main.java`: Interface de interação com o usuário
- `Carro.java`: Regras de comportamento do carro

---

### 🔹 Desafio 3 – Máquina de Banho para Pets 🐶🐱

Simulação de uma máquina automatizada para dar banho em pets:

- Adicionar/remover pet da máquina
- Abastecer shampoo e água
- Realizar o banho (reduz recursos e limpa o pet)
- Verificar se há pet na máquina
- Lavar a máquina antes de reutilizá-la

#### 🧱 Classes:
- `main.java`: Menu de operação
- `MaquinaDeBanho.java`: Lógica do funcionamento da máquina
- `Pet.java`: Modelo de pet com nome e estado de limpeza

---

## ▶️ Como executar os desafios

1. Clone este repositório:

```bash
git clone https://github.com/seu-usuario/desafios-poo-java.git
cd desafios-poo-java
```

2. Compile e execute cada desafio separadamente com uma IDE Java (como IntelliJ ou VS Code com extensão) ou via terminal, navegando até o diretório do desafio.

```bash
javac App.java ContaBancaria.java   # Desafio 1
java App
```

> Faça o mesmo para os outros desafios (`main.java`, `Carro.java` etc.).

---

## 🧠 Conceitos trabalhados

- Encapsulamento
- Métodos e atributos
- Condicionais e loops
- Relacionamento entre classes
- Manipulação de entrada via `Scanner`
- Simulação de estados (ligado/desligado, limpo/sujo, saldo positivo/negativo)

---

## 📁 Organização do projeto

```
📦 src
 ┣ 📂com.desafios
 ┃ ┣ 📂desafio1
 ┃ ┃ ┣ App.java
 ┃ ┃ ┗ ContaBancaria.java
 ┃ ┣ 📂desafio2
 ┃ ┃ ┣ main.java
 ┃ ┃ ┗ Carro.java
 ┃ ┗ 📂desafio3
 ┃ ┃ ┣ main.java
 ┃ ┃ ┣ MaquinaDeBanho.java
 ┃ ┃ ┗ Pet.java
```

---

## 👨‍💻 Autor

Desenvolvido por **Matheus Rossini**  
📍 Rio Grande do Sul, Brasil  
💼 Desenvolvedor Full Stack em formação

---

## 📜 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar, modificar e compartilhar!
