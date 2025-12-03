public class Main {
  public static void main(String[] args) {
      Funcionario funcionario1 = new Funcionario("Ana", 9000);
      Funcionario funcionario2 = new Funcionario("Fulano", 8500);

      funcionario1.exibirInformacoes();
      funcionario1.reajustarSalario(10);

      funcionario2.exibirInformacoes();
      funcionario2.reajustarSalario(5);

  }
}
