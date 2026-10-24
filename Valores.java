import java.util.Scanner;
import java.util.ArrayList;

public class Valores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        double nota;

        while (true) {
            System.out.print("Digite uma nota (-1 para encerrar): ");
            nota = entrada.nextDouble();

            if (nota == -1) {
                break;
            }

            notas.add(nota);
        }

        if (notas.size() > 0) {

            System.out.println("\nQuantidade de valores: " + notas.size());

            System.out.println("Notas na ordem informada:");

            for (int i = 0; i < notas.size(); i++) {
                System.out.print(notas.get(i) + " ");
            }

            System.out.println("\n\nNotas na ordem inversa:");

            for (int i = notas.size() - 1; i >= 0; i--) {
                System.out.println(notas.get(i));
            }

            double soma = 0;

            for (int i = 0; i < notas.size(); i++) {
                soma = soma + notas.get(i);
            }

            double media = soma / notas.size();

            int acimaMedia = 0;
            int abaixoSete = 0;

            for (int i = 0; i < notas.size(); i++) {

                if (notas.get(i) > media) {
                    acimaMedia++;
                }

                if (notas.get(i) < 7) {
                    abaixoSete++;
                }
            }

            System.out.println("Soma das notas: " + soma);
            System.out.println("Media das notas: " + media);
            System.out.println("Notas acima da media: " + acimaMedia);
            System.out.println("Notas abaixo de 7: " + abaixoSete);

        } else {
            System.out.println("Nenhuma nota foi informada.");
        }

        System.out.println("Programa encerrado!");
    }
}
