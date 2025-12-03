import model.Desenvolvedor;
import model.Funcionario;
import model.Gerente;

public class Main {
  public static void main(String[] args) {
    Gerente gerente = new Gerente("Mario", 15000);
    gerente.exibirInformacoes();
    gerente.reajustarSalario(2);
    gerente.setBonus(1000);

    Desenvolvedor desenvolvedor = new Desenvolvedor("Carla", 12000, "Backend Java");
    desenvolvedor.exibirInformacoes();

  }
}
