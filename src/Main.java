import model.Desenvolvedor;
import model.Funcionario;
import model.Gerente;

public class Main {
  public static void main(String[] args) {
    Funcionario gerente = new Gerente("Mario", 15000);
    gerente.exibirInformacoes();
    gerente.reajustarSalario(2);
    ((Gerente) gerente).setBonus(1000);
    gerente.calcularPLR();
    ((Gerente) gerente).aprovarProjeto("uso de IA nos códigos Java");

    Funcionario desenvolvedor = new Desenvolvedor("Carla", 12000, "Backend Java");
    desenvolvedor.reajustarSalario();
    desenvolvedor.exibirInformacoes();
    desenvolvedor.calcularPLR();
  }
}
