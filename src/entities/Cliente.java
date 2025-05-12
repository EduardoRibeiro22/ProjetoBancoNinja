package entities;

import Acess.Autorization;
import OrganizationEnumAndOther.MajorityAge;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private int idade;
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    public Cliente(String nome, String cpf, String email, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }


    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public void mudarIdade(int idade , String senha) {
        if(senha.equals(Autorization.senhaAdmin)) {
            this.idade = idade;
        } else{
            System.out.println("Senha incorreta de Administrador incorreta! ");
        }
    }
    public void mudarCpf(String cpf, String senha) {
        if(senha.equals(Autorization.senhaAdmin)) {
            this.cpf = cpf;
        }
        else{
            System.out.println("Senha incorreta de Administrador incorreta! ");
        }
    }
}
