package methodsFunction;

import Acess.Autorization;
import entities.Livro;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveBook {
    public static void removerLivro( Scanner sc, ArrayList <Livro> listaLivros) {
        System.out.println("Digite o nome do livro que deseja remover: ");
        String nomeLivro = sc.nextLine();
        System.out.println("Digite a senha de Administrador para remover: ");
        String senhaAdmin = sc.nextLine();
        int verification = 0;
        for(Livro livro: listaLivros){
        if (livro.getTitulo().equals(nomeLivro) && senhaAdmin.equals(Autorization.senhaAdmin)){
            listaLivros.remove(livro);
            verification = 1;
            System.out.println("Livro removido com sucesso!");
            break; }
        }
        if(verification == 0){
          if(senhaAdmin.equals(Autorization.senhaAdmin)){
              System.out.println("Livro incorreto!");
          } else{
              System.out.println("Senha incorreta!");
          }
        }
    }
}
