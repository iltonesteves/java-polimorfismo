package exemplos.polimorfismo;

/**
 * Classe utilizada para representar uma Pessoa Física
 * que é uma subclasse de Pessoa.
 */
public class PessoaFisica extends Pessoa {
  private String cpf;

  public PessoaFisica() {
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return "Pessoa Fisica: " + super.getNome() + " - CPF: " + this.getCpf();
  }
}
