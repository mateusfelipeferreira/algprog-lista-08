
import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] contadores = new int[9];
        double vendas, salario;

        System.out.print("Digite o valor das vendas: ");
        vendas = entrada.nextDouble();

        salario = 200 + vendas * 0.09;

        if (salario < 300) {
            contadores[0]++;
        } else if (salario < 400) {
            contadores[1]++;
        } else if (salario < 500) {
            contadores[2]++;
        } else if (salario < 600) {
            contadores[3]++;
        } else if (salario < 700) {
            contadores[4]++;
        } else if (salario < 800) {
            contadores[5]++;
        } else if (salario < 900) {
            contadores[6]++;
        } else if (salario < 1000) {
            contadores[7]++;
        } else {
            contadores[8]++;
        }

        System.out.println("Salario: $" + salario);
        System.out.println("Faixa $200 - $299: " + contadores[0]);
        System.out.println("Faixa $300 - $399: " + contadores[1]);
        System.out.println("Faixa $400 - $499: " + contadores[2]);
        System.out.println("Faixa $500 - $599: " + contadores[3]);
        System.out.println("Faixa $600 - $699: " + contadores[4]);
        System.out.println("Faixa $700 - $799: " + contadores[5]);
        System.out.println("Faixa $800 - $899: " + contadores[6]);
        System.out.println("Faixa $900 - $999: " + contadores[7]);
        System.out.println("Faixa $1000 em diante: " + contadores[8]);

    }
}
