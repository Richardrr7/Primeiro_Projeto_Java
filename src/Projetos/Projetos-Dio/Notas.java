
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){

        System.out.print("Digite a nota np1: ");
        double notaNp1 = scanner.nextDouble();

        System.out.print("Digite a nota np2:");
        double notaNp2 = scanner.nextDouble();

        System.out.print("Digite a nota pim: ");
        var notaPim = scanner.nextDouble();


        Media m1 = new  Media(notaNp1, notaNp2, notaPim);
        double notaMedia = m1.calcularMedia();

        if(notaMedia >=7){
            System.out.printf("Aluno aprovado sem exame. Média: %.1f\n", notaMedia);
        }
        else{
            System.out.printf("Aluno com media inferior a 7 --- Média: %.1f\n",notaMedia);
            System.out.println("Necessário a realização do exame.");
            Exame e1 = new Exame(notaMedia);
            e1.calcularExame(scanner);
        }
        }
    }
}
