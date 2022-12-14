package exemplos.polimorfismo;

/**
 * Classe utilizada para representar uma Pessoa Jurídica
 * que é uma subclasse de Pessoa.
 */
public class PessoaJuridica extends Pessoa {
  private String cnpj;

  public PessoaJuridica() {
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getNome() {
    return "Pessoa Juridica: " + super.getNome() + " - CNPJ: " + this.getCnpj();
  }
}
