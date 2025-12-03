package model;

public class Desenvolvedor extends Funcionario {

  private final String stack;

  public Desenvolvedor(String nome, double salario, String stack) {
    super(nome, salario);
    this.stack = stack;
  }

  @Override
  public void exibirInformacoes() {
    System.out.printf("Desenvolvedor: %s - salário: %.2f - Stack: %s", nome, salario, stack);
  }
}
