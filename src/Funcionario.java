public class Funcionario {

  private String nome;
  private String cargo;
  private double salario;

  public Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public void exibirInformacoes() {
    System.out.printf("Funcionario: %s - Cargo: %s - Salário %.2f \n", nome, cargo, salario);
  }

  public void reajustarSalario(double percentual) {
    salario += salario * (percentual / 100);
    System.out.printf("Novo salario de %s é %.2f \n", nome, salario);
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String getNome() {
    return nome;
  }

  public double getSalario() {
    return salario;
  }
}
