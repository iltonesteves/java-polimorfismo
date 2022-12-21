# java-polimorfismo

Quando trabalhamos com herança e dizemos que uma subclasse PessoaFisica e PessoaJuridica são filhas da super classe Pessoa, podemos então dizer que PessoaFisica é uma Pessoa e PessoaJuridica é uma Pessoa, justamente por ser uma extensão ou tipo mais especificado deste. Essa é a semântica da herança.

* Dizer que uma Pessoa é uma PessoaFisica **está errado**, porque ela pode também ser uma PessoaJuridica.


* Quando trabalhamos com uma variável do tipo Pessoa que é uma super classe, podemos fazer está variável receber um objeto do tipo PessoaFisica ou PessoaJuridica, por exemplo:

```
Pessoa fisica = new PessoaFisica();
Pessoa juridica = new PessoaJuridica();
```

* Com isso, podemos dizer que **polimorfismo** é a capacidade de um objeto ser referenciado de diversas formas diferentes e com isso realizar as mesmas tarefas (ou chamadas de métodos) de diferentes formas.


* Um exemplo do uso do polimorfismo utilizando a classe Pessoa, seria todas as subclasses sobrescreverem o método public String getNome().

***
