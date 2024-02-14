import java.util.Locale;
import java.util.Scanner;

public class MainImposto {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salarioAnual, pretacaoServico, ganhoCapital, gastosMedicos, gastosEducacionais, salarioMensal, impostoSalario;

        System.out.print("Renda anual com o salário: ");
        salarioAnual = sc.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        pretacaoServico = sc.nextDouble();

        System.out.print("Renda anual com ganho capital: ");
        ganhoCapital = sc.nextDouble();

        System.out.print("Gastos médicos: ");
        gastosMedicos = sc.nextDouble();

        System.out.print("Gastos educacionais: ");
        gastosEducacionais = sc.nextDouble();

        System.out.println();
        System.out.println("RELATORIO DE IMPOSTO DE RENDA");
        System.out.println();

        System.out.println("CONSOLIDADO DE RENDA: ");

        salarioMensal = salarioAnual / 12;

        if (salarioMensal < 3000) {
            System.out.println("Imposto sobre salário: " + 0.00);
        } else if (salarioMensal >= 3000 && salarioMensal < 5000) {
            impostoSalario = salarioAnual * 0.10;
            System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
        } else {
            impostoSalario = salarioAnual * 0.20;
            System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
        }


        sc.close();
    }
}