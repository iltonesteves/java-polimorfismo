package exemplos.polimorfismo;

/**
 * Classe utilizada para demonstrar o uso do polimorfismo,
 * vamos criar duas variaveis do tipo Pessoa e adicionar nele objetos
 * do tipo PessoaFisica e PessoaJuridica.
 */
public class TestePessoa3 {
  public static void main(String[] args) {
    PessoaFisica fisica = new PessoaFisica();
    fisica.setNome("Alexandre");
    fisica.setCpf("12345678901");

    PessoaJuridica juridica = new PessoaJuridica();
    juridica.setNome("Empresa LTDA");
    juridica.setCnpj("12345678000199");

    Pessoa pessoa1 = fisica;
    Pessoa pessoa2 = juridica;

    System.out.println("Pessoa 1");
    System.out.println(pessoa1.getNome());

    System.out.println("Pessoa 2");
    System.out.println(pessoa2.getNome());
  }
}
