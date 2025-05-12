package methodsFunction;

import java.util.ArrayList;
import java.util.Scanner;
import entities.Livro;

public class ListarLivros {
    public static void listarLivros(Scanner sc, ArrayList<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("A lista de livros está vazia!");
        }else{
            for(Livro livro : livros) {

            System.out.println(livro);
                System.out.println("================================");
            }
        }
    }
}
