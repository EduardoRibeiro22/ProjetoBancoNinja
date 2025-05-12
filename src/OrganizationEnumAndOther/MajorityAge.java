package OrganizationEnumAndOther;

import java.util.Scanner;

public enum MajorityAge {
    MAIOR("Maior"),
    MENOR("Menor"),
    NDEFINIDO("NULL");

    private String majorityAge;

    MajorityAge(String majorityAge) {
        this.majorityAge = majorityAge;
    }

    public String getMajorityAge() {
        return majorityAge;
    }

    public MajorityAge selecionarCatigoria(Scanner sc) {
        int whileContinue = 0;

            System.out.println("Selecione uma Maioridade: ");
            System.out.println("1 - Maior");
            System.out.println("2 - Menor");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    return MajorityAge.MAIOR;
                case 2:
                    return MajorityAge.MENOR;
                default:
                    return MajorityAge.NDEFINIDO;
            }
        }
    }