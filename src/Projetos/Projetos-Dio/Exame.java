
import java.util.Scanner;

public class Exame {
    double notaMedia_CalcualarExame;

    public Exame(double notaMedia){
        this.notaMedia_CalcualarExame = notaMedia;
    }


    public void calcularExame(Scanner scanner){
        System.out.println("Digite a nota do exame: ");
        double exame = scanner.nextDouble();
        double notaExame = (exame + notaMedia_CalcualarExame) / 2;
        
        if(notaExame >= 5){
            System.out.printf("Média: %.1f\n.  Média superior a 5. Aluno aprovado.", notaExame);
        }
        else{
            System.out.printf("Média: %.1f\n. Média inferior a 5. Aluno reprovado.", notaExame);
        }

    }

}
