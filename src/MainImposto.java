import java.util.Locale;
import java.util.Scanner;

public class MainImposto {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salarioAnual, pretacaoServico, ganhoCapital, gastosMedicos,
                gastosEducacionais, salarioMensal, impostoSalario = 0, impostoPrestacao = 0,
                impostoCapital = 0, maximoDedutivel, gastosDedutiveis, impostoBruto, impostoDevido;

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

        if (pretacaoServico <= 0.00) {
            System.out.println("Imposto sobre serviço: " + 0.00);
        } else {
            impostoPrestacao = pretacaoServico * 0.15;
            System.out.printf("Imposto sobre serviço: %.2f%n", impostoPrestacao);
        }

        if (ganhoCapital <= 0.00) {
            System.out.println("Imposto sobre ganho capital: " + 0.00);
        } else {
            impostoCapital = ganhoCapital * 0.20;
            System.out.printf("Imposto sobre ganho capital: %.2f%n", impostoCapital);
        }

        System.out.println();
        System.out.println("DEDUÇÕES: ");


        maximoDedutivel =  (impostoSalario + impostoPrestacao + impostoCapital) * 0.30;
        System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);

        gastosDedutiveis = gastosMedicos + gastosEducacionais;
        System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);

        System.out.println();
        System.out.println("RESUMO: ");

        impostoBruto =  (impostoSalario + impostoPrestacao + impostoCapital);
        System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);

        if (maximoDedutivel > gastosDedutiveis) {
            System.out.printf("Abatimento: %.2f%n",gastosDedutiveis);
            impostoDevido = impostoBruto - gastosDedutiveis;
        }else {
            System.out.printf("Abatimento: %.2f%n",maximoDedutivel);
            impostoDevido = impostoBruto - maximoDedutivel;
        }

        System.out.printf("Imposto devido: %.2f%n",impostoDevido);


        sc.close();
    }
}