package repository;

import java.util.ArrayList;
import java.util.List;

import model.Conta;

public class ContaRepositoryMemoria implements Repository<Conta> {

    private static List<Conta> contas = new ArrayList<>();

    @Override
    public Conta findOne(int id) {
        return contas.get(id);
    }

    @Override
    public List<Conta> findAll() {
        return contas;
    }

    @Override
    public Conta create(Conta objeto) {
        contas.add(objeto);
        return objeto;
    }

    @Override
    public void delete(Conta objeto) {
        contas.remove(objeto);
    }

    @Override
    public Conta update(Conta objeto) {
        throw new RuntimeException("Ainda não implementado");
    }
}