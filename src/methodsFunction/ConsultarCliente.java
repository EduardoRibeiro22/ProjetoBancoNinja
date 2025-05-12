package methodsFunction;

import java.util.ArrayList;
import java.util.Scanner;
import entities.Cliente;
import entities.Livro;

public class ConsultarCliente {
    public static void consultarCliente(Scanner sc, ArrayList<Cliente> clientes) {
        System.out.println("Escolha o modo que deseja consultar: ");
        System.out.println("1 - Por nome");
        System.out.println("2 - Por cpf");
        int opc = sc.nextInt() ;
        sc.nextLine();
        switch (opc) {
            case 1:
                System.out.println("Digite o nome do cliente: ");
                String nome = sc.nextLine();
                for (Cliente cliente : clientes) {
                    if (cliente.getNome().equals(nome)) {
                        System.out.println("Cliente encontrado!");
                        System.out.println("Informações do Cliente: " + cliente.getNome() +", email: " + cliente.getEmail() + ", idade: " + cliente.getIdade() );
                        System.out.println("Livros com o Cliente:" + cliente.getLivrosEmprestados().size());
                        if(!cliente.getLivrosEmprestados().isEmpty()){
                        for (Livro livro : cliente.getLivrosEmprestados()) {
                            System.out.printf("Titulo: %s\n", livro.getTitulo());
                            System.out.println("=====================================");
                            }
                        }else{
                            System.out.println("O cliente não tem livros emprestados!");
                        }
                    }
                }
        }
    }
}
