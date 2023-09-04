package utils;

import model.Conta;

public class ValidarSenha {

    public boolean execute(Conta conta, String senha) {
        return conta.getSenha().equals(Criptografia.criptografar(senha));
    }
}
