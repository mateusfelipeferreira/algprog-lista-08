import java.util.Scanner;
import java.util.ArrayList;

public class Temperatura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Double> temperaturas = new ArrayList<>();

        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril",
            "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        double soma = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura de " + meses[i] + ": ");
            double temperatura = entrada.nextDouble();

            temperaturas.add(temperatura);
            soma = soma + temperatura;
        }

        double media = soma / 12;

        System.out.println("\nMedia anual: " + media);
        System.out.println("Temperaturas acima da media:");

        for (int i = 0; i < 12; i++) {
            if (temperaturas.get(i) > media) {
                System.out.println(
                    meses[i] + ": " + temperaturas.get(i) + " graus"
                );
            }
        }
    }
}