package methodsFunction;

import Acess.Autorization;
import entities.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class DeletarCliente {
    public static void deletarCliente(Scanner sc, ArrayList<Cliente> listaClientes) {
        int verification = 0;
        System.out.println("Digite o nome do Cliente que deseja deletar: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o CPF do Cliente");
        String cpfCliente = sc.nextLine();
        System.out.println("Atenção os dados do Cliente serão deletados! Digite SIM OU NAO para continuar...");
        String deletarQuestion = sc.nextLine();
        if(deletarQuestion.equalsIgnoreCase("SIM")) {
            System.out.print("Digite a senha de Administrador para deletar: ");
            String senhaDeletar = sc.nextLine();
            if(senhaDeletar.equals(Autorization.senhaAdmin)) {
                for (Cliente cliente : listaClientes) {
                    if(cliente.getNome().equals(nomeCliente) && cliente.getCpf().equals(cpfCliente)) {
                        listaClientes.remove(cliente);
                        verification = 1;
                        System.out.println("Cliente deletado com sucesso!");
                        break;
                    }
                }
                if (verification == 0) {
                    System.out.println("Cliente não encontrado!");
                }
            } else {
                System.out.println("Senha incorreta!");
            }
        }else{
            System.out.println("Você escolheu cancelar a deleção!");
        }
    }
}
