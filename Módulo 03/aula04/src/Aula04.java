import service.CaixaEletronico;

public class Aula04 {
  public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        boolean continua = true;
        System.out.println("Bem vindo ao Santander");
        while (continua) {
            continua = caixaEletronico.execute();
        }
        System.out.println("Volte sempre!");
    }
}
