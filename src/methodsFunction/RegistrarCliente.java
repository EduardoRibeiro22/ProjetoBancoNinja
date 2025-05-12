package methodsFunction;

import entities.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarCliente {
    public static void registrarCliente(Scanner sc, ArrayList<Cliente> listaCliente) {
        System.out.println("Digite o nome e sobrenome do Cliente: ");
        String nome = sc.nextLine();
        System.out.println("Digite o CPF do Cliente: ");
        String cpf = sc.nextLine();
        System.out.println("Digite o email do Cliente: ");
        String email = sc.nextLine();
        System.out.println("Digite a idade do Cliente: ");
        int idade = sc.nextInt();
        sc.nextLine();
        Cliente cliente = new Cliente(nome, cpf, email, idade);
        listaCliente.add(cliente);
        System.out.println("Cliente criado com sucesso!");
        System.out.println("================================");

    }
}

