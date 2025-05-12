package methodsFunction;

import entities.Cliente;
import entities.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class EmprestarLivro {
    public static void emprestarLivro(Scanner sc, ArrayList<Livro> livros, ArrayList <Cliente> clientes) {
        int verificarCliente = 0;
        int verificarlivro = 0;
        System.out.print("Digite o nome do Cliente que deseja emprestar o livro: ");
        String nome = sc.nextLine();
        System.out.print("Digite o CPF do Cliente: ");
        String cpf = sc.nextLine();
        for (Cliente  cliente : clientes) {
            if(cliente.getCpf().equalsIgnoreCase(cpf) && nome.equalsIgnoreCase(cliente.getNome())) {
                verificarCliente = 1;
                System.out.println("Cliente encotrado com sucesso!");
                System.out.print("Agora digite o nome do livro que deseja emprestar: ");
                String nomeLivro = sc.nextLine();
                for (Livro livro : livros) {
                    if(livro.getTitulo().equals(nomeLivro)) {
                        verificarlivro = 1;
                        System.out.println("Livro encotrado com sucesso!");
                        System.out.println("Consultando se o Livro está disponível...........");
                        if(livro.getDisponivel() == true) {
                            cliente.getLivrosEmprestados().add(livro);
                            livro.setDisponivel(false);
                            System.out.println("Livro Emprestado com sucesso!");
                        }else{
                            System.out.println("Livro indisponível para emprestar!");
                        }
                    }
                }
                if (verificarlivro == 0) {
                    System.out.println("Livro não encontrado!");
                }
            }
        }
        if (verificarCliente == 0) {
            System.out.println("Cliente não encontrado! Por gentileza faça o cadastro do cliente que deseja emprestar!");
        }
    }
}
