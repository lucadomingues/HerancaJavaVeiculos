# 🚗 Projeto de Herança em Java – Veículos

Este projeto tem como objetivo demonstrar os principais conceitos de **Programação Orientada a Objetos (POO)** em Java, por meio de um sistema de hierarquia de veículos. Utilizamos uma **superclasse abstrata** chamada `Veiculo`, com duas subclasses concretas: `Carro` e `Moto`.

---

## 📌 Objetivos

- Aplicar **herança** entre classes.
- Utilizar **métodos e classes abstratas**.
- Demonstrar **polimorfismo** através de sobrescrita de métodos.
- Reforçar o conceito de **encapsulamento**.
- Criar métodos específicos em subclasses (especialização).

---

## 🧱 Estrutura de Classes

### 🔷 `Veiculo` (Superclasse Abstrata)

- Atributos:
  - `marca`, `modelo`, `cor`, `ano`, `preco`
- Métodos abstratos:
  - `abastecer()`, `ligar()`, `desligar()`
- Getters/Setters para atributos básicos.

### 🔷 `Carro` (Subclasse)

- Atributos adicionais:
  - `numeroPortas`, `cambioAutomatico`, `arCondicionado`, `caixaSom`, `limitePassageiros`
- Métodos específicos:
  - `ligarSom()`, `ligarArCondicionado()`

### 🔷 `Moto` (Subclasse)

- Atributos adicionais:
  - `cilindradas`, `partidaEletrica`, `abs`, `numeroMarchas`, `velocidadeMaxima`
- Métodos específicos:
  - `testarVelMax()`, `quantMarchas()`

### 🔷 `Main` (Classe Principal)

 - Demonstra o uso de Carro e Moto, instanciando objetos, acessando métodos herdados e especializados.
