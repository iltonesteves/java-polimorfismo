package exemplos.polimorfismo;

/**
 * Classe utilizada para demonstrar o uso do polimorfismo,
 * vamos criar duas variaveis do tipo Pessoa e adicionar nele objetos
 * do tipo PessoaFisica e PessoaJuridica.
 */
public class TestePessoa4 {
  public static void main(String[] args) {
    Pessoa pessoa1 = new PessoaFisica();
    pessoa1.setNome("Alexandre");

    Pessoa pessoa2 = new PessoaJuridica();
    pessoa2.setNome("Empresa LTDA");

    Object objeto = "Programação Orientada a Objetos";

    //casting de Pessoa para PessoaFisica
    PessoaFisica fisica = (PessoaFisica) pessoa1;
    fisica.setCpf("12345678901");

    //casting de Pessoa para PessoaJuridica
    PessoaJuridica juridica = (PessoaJuridica) pessoa2;
    juridica.setCnpj("12345678000199");

    //casting de Object para String
    String texto = (String) objeto;

    System.out.println(fisica.getNome());
    System.out.println(juridica.getNome());
    System.out.println(texto);
  }
}
