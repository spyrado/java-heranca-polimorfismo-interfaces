package model;

public abstract class Funcionario {

  protected String nome;
  protected double salario;

  public Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public void exibirInformacoes() {
    System.out.printf("Funcionario: %s - Salário %.2f \n", nome, salario);
  }

  public void reajustarSalario(double percentual) {
    salario += salario * (percentual / 100);
    System.out.printf("Novo salario de %s é %.2f \n", nome, salario);
  }

  public void reajustarSalario() {
    salario += 500;
    System.out.printf("Salário com dissídio de %s é %.2f \n", nome, salario);
  }
}
