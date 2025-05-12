package methodsFunction;

import java.util.ArrayList;
import java.util.Scanner;
import entities.Livro;

public class ConsultarLivro {
    public static void consultarLivro(Scanner sc, ArrayList<Livro> livros) {
        System.out.println("Digite o nome do livro que deseja consultar: ");
        int whilecontinuar = 0;
        int verificar = 0;
        while (whilecontinuar == 0) {
            String nome = sc.nextLine();
            for (Livro livro : livros) {
                if (livro.getTitulo().equals(nome)) {
                    System.out.println(livro);
                    verificar = 1;
                }
            }
            if (verificar == 0) {
                System.out.println("Livro não encontrado!");
            }
            System.out.println("Deseja continuar consultando Livros ? (S/N)");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                whilecontinuar = 1;
            }
        }
    }
}
