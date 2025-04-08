package service;

import exception.HospedeNaoEncontradoException;
import model.Hospede;

import java.util.ArrayList;

public class HospedeService {
    ArrayList <Hospede> hospedes = new ArrayList<>();

    public void cadastrarHospede(Hospede hospede){
        hospedes.add(hospede);
        System.out.println("O HOSPEDE  " + hospede.getNome() + " FOI CADASTRADO COM SUCESSO !");
    }

    public void editarDados(Hospede hospede, String cpf,String nome, String email, String telefone){
        hospede.setCpf(cpf);
        hospede.setNome(nome);
        hospede.setEmail(email);
        hospede.setTelefone(telefone);

        System.out.println("Seus dados foram alterados com sucesso !");
    }

    public void consultarDados(String cpf) throws HospedeNaoEncontradoException {
        if (!hospedes.equals(cpf)) {
            throw new HospedeNaoEncontradoException("CPF Não Encontrado! Este hóspede não está cadastrado.");
        }
        System.out.println("CPF DO HOSPEDE ENCONTRADO ! SEGUE OS DADOS: ");
        System.out.println("Nome: ");
    }


    public void consultarDados(Hospede hospede){
        System.out.println("CPF: " + hospede.getCpf() + "\n" + "NOME: " + hospede.getNome() + "\n" + "EMAIL: "+ hospede.getEmail() + "\n" + "TELEFONE: " + hospede.getTelefone());
    }

}
