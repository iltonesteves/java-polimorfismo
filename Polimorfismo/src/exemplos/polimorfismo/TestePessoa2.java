package exemplos.polimorfismo;

/**
 * Classe utilizada para demonstrar o uso do polimorfismo,
 * vamos criar um vetor de Pessoa e adicionar nele objetos
 * do tipo PessoaFisica e PessoaJuridica.
 */
public class TestePessoa2 {
  public static void main(String[] args) {
    PessoaFisica fisica = new PessoaFisica();
    fisica.setNome("Alexandre");
    fisica.setCpf("12345678901");

    PessoaJuridica juridica = new PessoaJuridica();
    juridica.setNome("Empresa LTDA");
    juridica.setCnpj("12345678000199");

    Pessoa[] pessoas = new Pessoa[2];
    pessoas[0] = fisica;
    pessoas[1] = juridica;

    for(Pessoa pessoa : pessoas) {
      System.out.println(pessoa.getNome());
    }
  }
}
