# Validador de Boleto

Biblioteca em Java para validar a **linha digitável de boletos bancários**, desenvolvida com testes automatizados (JUnit 5) e TDD.

## Funcionalidades

Validações implementadas até o momento:

- Aceita a linha digitável com ou sem formatação (pontos e espaços)
- Rejeita entradas nulas, vazias ou somente com espaços
- Rejeita linhas com letras ou outros caracteres que não sejam dígitos
- Exige exatamente **47 dígitos**, o tamanho padrão do boleto bancário

## Exemplo de uso

```java
ValidadorBoleto.validar("00190.00009 00123.456782 90123.456783 1 10000000010000"); // true
ValidadorBoleto.validar("00190000090012345678290123456783110000000010000");        // true
ValidadorBoleto.validar("0019A0000090012345678290123456783110000000010000");       // false (contém letra)
ValidadorBoleto.validar("0019000009001234567829012345678311000000001000");         // false (46 dígitos)
```

## Tecnologias

- Java 21
- Maven
- JUnit 5

## Como executar

**Pré-requisitos:** Java 21 e Maven instalados.

```bash
git clone https://github.com/boiaski/validar-boleto.git
cd validar-boleto
mvn test
```

## Estrutura

```
src
├── main/java/io/github/boiaski/validarboleto
│   └── ValidadorBoleto.java       # regras de validação
└── test/java/io/github/boiaski/validarboleto
    └── ValidadorBoletoTest.java   # testes automatizados
```

## Próximos passos

- [ ] Validar os dígitos verificadores de cada campo (módulo 10)
- [ ] Validar o dígito verificador geral (módulo 11)
- [ ] Converter linha digitável em código de barras
- [ ] Extrair banco, valor e data de vencimento
- [ ] Suporte a boletos de arrecadação (contas de consumo e tributos)

## Autor

**Guilherme de Souza Boiaski**
[LinkedIn](https://www.linkedin.com/in/guilherme-boiaski) · [GitHub](https://github.com/boiaski)