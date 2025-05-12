package methodsFunction;

import OrganizationEnumAndOther.MajorityAge;
import entities.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class CriarLivro {

    public static void criarLivro(Scanner sc, ArrayList <Livro> libray) {
        System.out.println("Digite o nome do livro: ");
        String nome = sc.nextLine();
        System.out.println("Digite uma Descrição do livro: ");
        String descricao = sc.nextLine();
        System.out.println("Digite o nome autor: ");
        String autor = sc.nextLine();
        System.out.println("Digite a categoria: ");
        String categoria = sc.nextLine();
        MajorityAge majorityAge = MajorityAge.NDEFINIDO;
        majorityAge = majorityAge.selecionarCatigoria(sc);
        while(majorityAge == MajorityAge.NDEFINIDO) {
            System.out.println("Categoria Indefinida!");
            System.out.println("Por gentileza tente novamente: ");
            majorityAge = majorityAge.selecionarCatigoria(sc);
        }
        System.out.println("O livro já vai estar disponivel para venda? Digite sim ou não");

        String status = sc.nextLine();
        boolean status1 =  status.equalsIgnoreCase("Sim")  ? true : false;

        Livro livro =  new Livro(nome, descricao, autor, categoria, majorityAge, status1);
        libray.add(livro);
        System.out.println("Livro criado com sucesso!");
        System.out.println("================================");

    }
}
