package service;

public class CaixaEletronico {

    public boolean execute() {
        MenuSeletor menuSeletor = new MenuSeletor();
        int opcao = menuSeletor.execute();

        return switch (opcao) {
            case 0 -> false;
            case 1 -> true; // ver saldo
            case 2 -> true;// sacar
            case 3 -> true;// depositar
            case 4 -> true;// transferir
            default -> tenteNovamente();
        };
    }

    private boolean tenteNovamente() {
        System.out.println("Opção inválida. Tente novamente.");
        return true;
    }
}
