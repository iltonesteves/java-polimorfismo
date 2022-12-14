package exemplos.polimorfismo;

/**
 * Classe utilizada para demonstrar o uso do polimorfismo,
 * vamos criar um vetor de Pessoa e adicionar nele objetos
 * do tipo PessoaFisica e PessoaJuridica.
 */
public class TestePessoa {
  public static void main(String[] args) {
    Pessoa fisica = new PessoaFisica();
    fisica.setNome("Alexandre");
    
    Pessoa juridica = new PessoaJuridica();
    juridica.setNome("Empresa LTDA");

    Pessoa[] pessoas = new Pessoa[2];
    pessoas[0] = fisica;
    pessoas[1] = juridica;

    for(Pessoa pessoa : pessoas) {
      System.out.println(pessoa.getNome());
    }
  }
}
