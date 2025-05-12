package program;

import entities.SolidLibray;
import methodsFunction.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SolidLibray libray = new SolidLibray();
        int whileContinue = 0;
        while (whileContinue == 0) {
            System.out.println("Bem vindo a Nosso Sistema de Biblioteca! ");
            System.out.println("Digite alguma das Opções a seguir: ");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Remover Livro");
            System.out.println("3 - Listar Livros");
            System.out.println("4 - Registrar Cliente");
            System.out.println("5 - Excluir Cliente");
            System.out.println("6 - Consultar Cliente");
            System.out.println("7 - Consultar Livros");
            System.out.println("8 - Emprestar Livro");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Você escolheu adiconar um livro! Deseja continuar? (S/N)");
                    String continuar = sc.nextLine();
                    if (continuar.equalsIgnoreCase("S")) {
                        CriarLivro.criarLivro(sc, libray.getListaLivros());

                    } else {
                        System.out.println("Você escolheu sair da opção! ");
                    }
                    break;
                case 2:
                    System.out.println("Você escolheu remover um livro! Deseja continuar? (S/N)");
                    continuar = sc.nextLine();
                    if (continuar.equalsIgnoreCase("S")) {
                        RemoveBook.removerLivro(sc, libray.getListaLivros());

                    } else {
                        System.out.println("Você escolheu sair da opção! ");

                    }
                    break;
                case 3:
                    System.out.println("Você escolheu Listar os livros da nossa biblioteca! Deseja continuar? (S/N)");
                    continuar = sc.nextLine();
                    if (continuar.equalsIgnoreCase("S")) {
                        ListarLivros.listarLivros(sc, libray.getListaLivros());

                    } else {
                        System.out.println("Você escolheu sair da opção! ");

                    }
                    break;
                case 4:
                    System.out.println("Você escolheu adiconar um Cliente! Deseja continuar? (S/N)");
                    continuar = sc.nextLine();
                    if (continuar.equalsIgnoreCase("S")) {
                        RegistrarCliente.registrarCliente(sc, libray.getListaClientes());

                    } else {
                        System.out.println("Você escolheu sair da opção! ");
                    }
                    break;
                case 5:
                    System.out.println("Você escolheu excluir um Cliente! Deseja continuar? (S/N)");
                    continuar = sc.nextLine();
                    if (continuar.equalsIgnoreCase("S")) {
                      DeletarCliente.deletarCliente(sc, libray.getListaClientes());

                    } else {
                        System.out.println("Você escolheu sair da opção! ");
                    }
                    break;
                case 6:
                    System.out.println("Você escolheu consultar um Cliente! Deseja continuar? (S/N)");
                    continuar = sc.nextLine();
                    if (continuar.equalsIgnoreCase("S")) {
                        ConsultarCliente.consultarCliente(sc, libray.getListaClientes());

                    } else {
                        System.out.println("Você escolheu sair da opção! ");
                    }
                    break;
                case 7 :
                    System.out.println("Você escolheu consultar um Livro! Deseja continuar? (S/N)");
                    continuar = sc.nextLine();
                    if (continuar.equalsIgnoreCase("S")) {
                        ConsultarLivro.consultarLivro(sc, libray.getListaLivros());

                    } else {
                        System.out.println("Você escolheu sair da opção! ");
                    }
                    break;
                case 8 :
                    System.out.println("Você escolheu emprestar um Livro! Deseja continuar? (S/N)");
                    continuar = sc.nextLine();
                    if (continuar.equalsIgnoreCase("S")) {
                        EmprestarLivro.emprestarLivro(sc,libray.getListaLivros(),libray.getListaClientes());

                    } else {
                        System.out.println("Você escolheu sair da opção! ");
                    }
                }
            }
        sc.close();
    }
}
