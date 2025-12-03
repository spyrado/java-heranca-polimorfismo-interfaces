package model;

public class Gerente extends Funcionario {

  private double bonus;

  public Gerente(String nome, double salario) {
    super(nome, salario);
  }

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  @Override
  public void exibirInformacoes() {
    System.out.printf("\nGerente: %s - salário %.2f - bônus: %.2f", nome, salario, bonus);
  }

  @Override
  public void calcularPLR() {
    System.out.println("\nPLR do Gerente");
  }
}
